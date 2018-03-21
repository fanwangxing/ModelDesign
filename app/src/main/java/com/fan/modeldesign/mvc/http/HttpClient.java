package com.fan.modeldesign.mvc.http;


import com.loopj.android.http.AsyncHttpClient;

public class HttpClient extends AsyncHttpClient {
    private static HttpClient client;
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public static class HttpKey {
        //req
        public static final String AccessToken = "accessToken";
        public static final String UserName = "userNameOrEmailAddress";
        public static final String Password = "password";
        public static final String Code = "code";

    }

    public static class ResultCode {
        public static final int Success = 0;
        public static final int NotNet = -1;
    }

    public static HttpClient getInstance() {
        if (client == null) {
            client = new HttpClient();
        }
        return client;
    }

    private HttpClient() {
    }


}
