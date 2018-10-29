package com.mahendra;

public class Country {
    private Region region; //Association

    private String id;
    private String name;

    public Country() {
    }

    public Country(Region region, String id, String name) {
        this.region = region;
        this.id = id;
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
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
}
