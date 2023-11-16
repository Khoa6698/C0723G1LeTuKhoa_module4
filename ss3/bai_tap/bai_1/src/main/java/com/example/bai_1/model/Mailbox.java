package com.example.bai_1.model;

public class Mailbox {
    private int id;
    private String languages;
    private int pageSize;
    private boolean spamsFilters;
    private String signature;

    public Mailbox() {
    }

    public Mailbox(int id, String languages, int pageSize, boolean spamsFilters, String signature) {
        this.id = id;
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamsFilters = spamsFilters;
        this.signature = signature;
    }

    public Mailbox(String languages, int pageSize, boolean spamsFilters, String signature) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamsFilters = spamsFilters;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFilters() {
        return spamsFilters;
    }

    public void setSpamsFilters(boolean spamsFilters) {
        this.spamsFilters = spamsFilters;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
