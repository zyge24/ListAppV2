package com.example.listappv2;

public class Item {
    String name;
    String note;

    long timestamp;

    public Item(String name, String note) {
        this.name = name;
        this.note = note;
        this.timestamp = System.currentTimeMillis();
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
