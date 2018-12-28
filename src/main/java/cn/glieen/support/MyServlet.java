package cn.glieen.support;

import java.util.Objects;

public abstract class MyServlet {
    protected abstract void doPost(MyRequest request,MyResponse response);

    protected abstract void doGet(MyRequest request, MyResponse response);

    public void service(MyRequest request, MyResponse response) {
        String method = request.getMethod();
        Objects.requireNonNull(method);
        if ("get".equalsIgnoreCase(method)) {
            doGet(request, response);
        }else{
            doPost(request, response);
        }
    }
}
