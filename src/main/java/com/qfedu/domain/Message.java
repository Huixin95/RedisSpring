package com.qfedu.domain;

public class Message {
    private String mname;

    private String content;

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "mname='" + mname + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
