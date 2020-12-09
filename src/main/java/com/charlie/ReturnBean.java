package com.charlie;

public class ReturnBean {

    private String count;

    public ReturnBean() {
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ReturnBean [count=" + count + "]";
    }
    
}
