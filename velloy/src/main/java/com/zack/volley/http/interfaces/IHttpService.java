package com.zack.volley.http.interfaces;

import org.apache.http.HttpEntity;

/**
 * Created by Zack on 2017/6/9.
 * 获取网络
 */

public interface IHttpService {
    /**
     * 设置url
     * @param url
     */
    void setUrl(String url);

    /**
     * 执行获取网络
     */
    void excute();

    /**
     * 设置回调接口
     * @param httpListener
     */
    void setHttpListener(IHttpListener httpListener);

    /**
     *
     */
    void setRequestData(byte[] requestData);
}
