package cn.glieen.test;

import cn.glieen.MyTomcat;
import cn.glieen.mapping.ServletMapping;
import org.junit.Test;

import java.io.IOException;

public class MainTest {

    @Test
    public void test() throws IOException {
        ServletMapping.mapping("/hello", new HelloServlet());
        MyTomcat tomcat = new MyTomcat(8080);
        tomcat.start();
    }
}
