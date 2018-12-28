package cn.glieen.mapping;

import cn.glieen.support.DefaultServlet;
import cn.glieen.support.MyServlet;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ServletMapping {
    private static Map<String, MyServlet> servletMapping = new HashMap<>();
    private static MyServlet defaultServlet = new DefaultServlet();

    public static void mapping(String url, MyServlet servlet) {
        servletMapping.put(url, servlet);
    }

    public static MyServlet getServlet(String url) {
        MyServlet servlet = servletMapping.get(url);
        return Objects.isNull(servlet) ? defaultServlet : servlet;
    }
}
