package com.example.user.sqlitedemo.models;

/**
 * Created by User on 08-Apr-17.
 */

public class Movie {
    private int id;
    private String name;
    private String description;
    private String latitude;
//    private String longitude;
//    private String picId;

    public Movie() {
        id = 0;
        name = "";
        description = "";
        latitude = "";
//        longitude = "";
//        picId = "";
    }
//
//    public Movie(int id, String name, String description) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//    }
    public Movie(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
//        this.latitude = latitude;
//        this.longitude = longitude;
//        this.picId = picId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
//
//    public String getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(String longitude) {
//        this.longitude = longitude;
//    }
//
//    public String getPicId() {
//        return picId;
//    }
//
//    public void setPicId(String picId) {
//        this.picId = picId;
//    }

    //    @Override
//    public String toString() {
//        return  "\n"+
//                "Id: " + id + "\n" +
//                "Name: " + name + "\n" +
//                "Description: " + description + "\n";
//    }
    @Override
    public String toString() {
        return  "\n"+
                "Id: " + id + "\n" +
                "Name: " + name + "\n" +
                "Description: " + description + "\n"
//                "Latitude: " + latitude + "\n"
//                "Longitude: " + longitude + "\n" +
//                "PicId" + picId + "\n"
                ;
    }
}

