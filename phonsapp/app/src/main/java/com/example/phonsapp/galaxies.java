package com.example.phonsapp;

import java.io.Serializable;

public class galaxies implements Serializable {
    private String galaxyName;
    private String galaxyConstellation;
    private int galaxyImage;

    public galaxies(String galaxyName, String galaxyConstellation, int galaxyImage) {
        this.galaxyName = galaxyName;
        this. galaxyConstellation = galaxyConstellation;
        this.galaxyImage = galaxyImage;
    }

    public String getGalaxyName() {
        return galaxyName;
    }

    public void setGalaxyConstellation(String galaxyConstellation) {
        this.galaxyConstellation = galaxyConstellation;
    }

    public String getGalaxyConstellation() {
        return galaxyConstellation;
    }

    public void setGalaxyImage(int galaxyImage) {
        this.galaxyImage = galaxyImage;
    }

    public int getGalaxyImage() {
        return galaxyImage;
    }

    public void setGalaxyName(String galaxyName) {
        this.galaxyName = galaxyName;



    }
}