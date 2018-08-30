package com.example.ashi.multipleviewtypesinsinglerecyclerview.Model;

public class DataModel {
    public static final String HEADER_TYPE="HEADER_TYPE";
    public static final String SUB_HEADER_TYPE="SUB_HEADER_TYPE";
    String text;
    String viewType;
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

}
