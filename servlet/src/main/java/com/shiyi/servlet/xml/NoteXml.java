package com.shiyi.servlet.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NoteXml {

    public static void main(String[] args) throws DocumentException, IOException {
        File xmlFile = new File("xml/note.xml");
        SAXReader reader = new SAXReader();
        Document xmlDoc = reader.read(xmlFile);
//        System.out.println(xmlDoc);
        //根元素
        Element root = xmlDoc.getRootElement();
//        System.out.println(root.getName());
        final String to = root.elementText("to");
        final String from = root.elementText("from");
        final String heading = root.elementText("heading");
        final String body = root.elementText("body");
        final String name = root.attributeValue("name");
        System.out.println(name+","+to+","+from+","+heading+","+body);
        final Element qqqEl = root.addElement("qqq");
        qqqEl.setText("www");
        qqqEl.addAttribute("sex", "male");
        //修改一个xml文档
        FileWriter fw = new FileWriter("xml/note2.xml");
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter writer = new XMLWriter(fw,format);
        writer.write(xmlDoc);
        writer.close();
    }
}
