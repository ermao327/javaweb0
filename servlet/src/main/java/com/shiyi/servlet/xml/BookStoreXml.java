package com.shiyi.servlet.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class BookStoreXml {

    Document document;

    public BookStoreXml(){
        try {
            this.document = parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Document parse() throws Exception {
        File xmlFile = new File("xml/bookstore.xml");
        SAXReader reader = new SAXReader();
        return  reader.read(xmlFile);
    }

    public Book queryByTitle(String title){
        Element bookEl =  (Element)document.selectSingleNode("//book[title='"+title+"']");
        return new Book(bookEl.attributeValue("category"),
                bookEl.elementText("title"),
                bookEl.element("title").attributeValue("lang"),
                bookEl.elementText("author"),
                bookEl.elementText("year"),
                Double.valueOf(bookEl.elementText("price")));
    }

    public List<Book> queryAll(){
        Element root = document.getRootElement();
        final List<Element> bookElList = root.elements("book");
        List<Book> bookList = new ArrayList<>();
        for (Element bookEl : bookElList) {
            final String category = bookEl.attributeValue("category");
            final String title = bookEl.elementText("title");
            final String lang = bookEl.element("title").attributeValue("lang");
            final String author = bookEl.elementText("author");
            final String year = bookEl.elementText("year");
            final Double price = Double.valueOf(bookEl.elementText("price"));
            bookList.add(new Book(category, title,
                    lang, author, year, price));
        }
        return bookList;
    }

    public void addOne(Book book) throws Exception {
        Element root = document.getRootElement();
        final Element bookEl = root.addElement("book");
        bookEl.addAttribute("category", book.getCategory());
        final Element titleEl = bookEl.addElement("title");
        titleEl.addAttribute("lang", book.getLang());
        titleEl.setText(book.getTitle());
        bookEl.addElement("author").setText(book.getAuthor());
        bookEl.addElement("year").setText(book.getYear());
        bookEl.addElement("price").setText(book.getPrice().toString());
        saveToFile();
    }

    public void deleteByTitle(String title) throws Exception {
        final Element rootElement = document.getRootElement();
        rootElement.remove(document.selectSingleNode("//book[title='"+title+"']"));
        saveToFile();
    }

    private void saveToFile() throws Exception {
        FileWriter fw = new FileWriter("xml/bookstore2.xml");
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter writer = new XMLWriter(fw,format);
        writer.write(document);
        writer.close();
    }



    public static void main(String[] args) throws Exception {
        final BookStoreXml bookStoreXml = new BookStoreXml();
//        System.out.println(bookStoreXml.queryAll());
//        System.out.println(bookStoreXml.queryByTitle("Harry Potter"));

//        bookStoreXml.addOne(new Book("aaa", "bbb", "ccc", "ddd", "2000", 30.2));
        bookStoreXml.deleteByTitle("Learning XML");
    }
}