package com.shiyi.servlet.mvc.util;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

@WebServlet(name = "InitServlet", value = "/InitServlet",loadOnStartup = 0)
public class InitServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        String realPath = config.getServletContext().getRealPath("");
        System.out.println("realPath="+realPath);
        File file = new File(realPath+"\\WEB-INF\\db.properties");
        final Properties properties = new Properties();
        try {
            properties.load(new FileReader(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Cache.driver = properties.getProperty("driver");
        Cache.url = properties.getProperty("url");
        Cache.username = properties.getProperty("username");
        Cache.password = properties.getProperty("password");
        System.out.println(Cache.url);
    }

}
