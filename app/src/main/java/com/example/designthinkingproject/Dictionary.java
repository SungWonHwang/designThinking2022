package com.example.designthinkingproject;

public class Dictionary {
    private String id;
    private String name1;
    private String name2;

    public Dictionary(String id, String name1, String name2) {
        this.id = id;
        this.name1 = name1;
        this.name2 = name2;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName_1() {
        return name1;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }
    public String getName_2() {
        return name2;
    }
    public void setName2(String name1) {
        this.name2 = name2;
    }

}
