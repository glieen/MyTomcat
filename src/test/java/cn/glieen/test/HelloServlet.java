package cn.glieen.test;

import cn.glieen.support.MyRequest;
import cn.glieen.support.MyResponse;
import cn.glieen.support.MyServlet;

import java.io.IOException;
import java.io.OutputStream;

/**
 * author: Glieen
 * date: 2018/12/28
 * time: 16:33
 * desc:
 */

public class HelloServlet extends MyServlet {
    @Override
    protected void doPost(MyRequest request, MyResponse response) {
        doGet(request, response);
    }

    @Override
    protected void doGet(MyRequest request, MyResponse response) {
        OutputStream out = response.getOut();
        String responseStr = "HTTP/1.1 200 OK\n\nHello World!";
        try {
            out.write(responseStr.getBytes());
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
