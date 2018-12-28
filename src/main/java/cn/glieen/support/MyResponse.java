package cn.glieen.support;

import java.io.OutputStream;

public class MyResponse {
    private OutputStream out;

    public MyResponse(OutputStream out) {
        this.out = out;
    }

    public OutputStream getOut() {
        return out;
    }
}
