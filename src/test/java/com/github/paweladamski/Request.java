package com.github.paweladamski;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;

import java.io.UnsupportedEncodingException;

public class Request {

    public static HttpUriRequest httpPost(String host, String content) throws UnsupportedEncodingException {
        HttpPost post = new HttpPost(host);
        HttpEntity entity = new StringEntity(content);
        post.setEntity(entity);
        return post;
    }

    public static HttpUriRequest httpPut(String host, String content) throws UnsupportedEncodingException {
        HttpPut post = new HttpPut(host);
        HttpEntity entity = new StringEntity(content);
        post.setEntity(entity);
        return post;
    }
}
