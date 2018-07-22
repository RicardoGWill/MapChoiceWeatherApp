package com.ricardogwill.mapchoiceweatherapp.Model;

public class Weather {

    private int id;
    private String main;
    private String description;
    private String loon;

    public Weather(int id, String main, String description, String loon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.loon = loon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLoon() {
        return loon;
    }

    public void setLoon(String loon) {
        this.loon = loon;
    }
}
