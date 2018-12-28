package cn.glieen.handler;

import cn.glieen.mapping.ServletMapping;
import cn.glieen.support.MyRequest;
import cn.glieen.support.MyResponse;
import cn.glieen.support.MyServlet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class DefaultHandler implements Runnable {
    private Socket socket;

    public DefaultHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            MyRequest request = new MyRequest(socket.getInputStream());
            OutputStream out = socket.getOutputStream();
            MyResponse response = new MyResponse(out);

            MyServlet servlet = ServletMapping.getServlet(request.getUrl());
            servlet.service(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
