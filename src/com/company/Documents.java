package com.company;

public class Documents {
    private int id;
    private String name;
    private String descryption;

    public Documents(int id, String name, String descryption) {
        this.id = id;
        this.name = name;
        this.descryption = descryption;
    }

    public Documents(String descryption) {
        this.descryption = descryption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descryption='" + descryption + '\'' +
                '}';
    }
}
