package org.readium.r2.navigator;

import org.json.JSONObject;

public class MessageEvent<T> {

    private String message;
    private T data;
    private JSONObject json;
    private String beanJson;
    private int flag;

    public MessageEvent(String message) {
        this.message = message;
    }

    public MessageEvent(String message, String beanJson) {
        this.message = message;
        this.beanJson = beanJson;
    }

    public MessageEvent(String message, T data) {
        this.message = message;
        this.data = data;

    }

    public MessageEvent(String message, int flag) {
        this.message = message;
        this.flag = flag;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JSONObject getJson() {
        return json;
    }

    public void setJson(JSONObject json) {
        this.json = json;
    }


    public String getBean() {
        return beanJson;
    }

    public void setBean(String beanJson) {
        this.beanJson = beanJson;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
