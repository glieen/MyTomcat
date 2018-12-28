package cn.glieen.support;

import java.io.IOException;
import java.io.OutputStream;

public class DefaultServlet extends MyServlet {
    @Override
    protected void doPost(MyRequest request, MyResponse response) {
        doGet(request, response);
    }

    @Override
    protected void doGet(MyRequest request, MyResponse response) {
        OutputStream out = response.getOut();
        try {
            String responseStr = "HTTP/1.1 200 OK\n\n404";
            out.write(responseStr.getBytes());
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
