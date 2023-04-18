package com.example.listappv2;

public class Item {
    boolean important;
    String name;
    String note;

    long timestamp;

    public Item(String name, String note, boolean important) {
        this.name = name;
        this.note = note;
        this.important = important;
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

    public boolean getImportant() {return important;
    }
}
