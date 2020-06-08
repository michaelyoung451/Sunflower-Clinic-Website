package com.sunflowerclinicmassage.website.models;

public class Addon {


    private String name;
    private String shortDescription;
    private String photoPath;
    //private String longDescription;

    public Addon(String name, String shortDescription, String photoPath/*, String longDescription*/) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.photoPath = photoPath;
        //this.longDescription = longDescription;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /*public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }*/

    @Override
    public String toString() {
        return "Addon{" +
                "name='" + name + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", photoPath='" + photoPath + '\'' +
                //", longDescription='" + longDescription + '\'' +
                '}';
    }
}
