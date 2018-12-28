package cn.glieen.support;

import java.io.IOException;
import java.io.InputStream;

public class MyRequest {
    private String url;
    private String method;

    public MyRequest(InputStream in) {
        try {
            byte[] bytes = new byte[in.available()];
            in.read(bytes);
            String[] requestParam = new String(bytes).split(" ");
            this.method = requestParam[0];
            this.url = requestParam[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

}
