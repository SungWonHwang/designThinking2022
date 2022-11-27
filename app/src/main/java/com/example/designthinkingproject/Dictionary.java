package com.example.designthinkingproject;

public class Dictionary {
    private String id;
    private String name;
    private String defi;

    public Dictionary(String id, String name, String defi) {
        this.id = id;
        this.name = name;
        this.defi = defi;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDefi() {
        return defi;
    }
    public void setDefi(String defi) {
        this.defi = defi;
    }

}
