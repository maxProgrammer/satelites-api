package com.maxprogramer.api.pokemon.model;

import lombok.Data;

@Data
public class Satelite {

    public class Root{
        private String name;
        private int id;
        private double latitude;
        private double longitude;
        private double altitude;
        private double velocity;
        private String visibility;
        private double footprint;
        private int timestamp;
        private double daynum;
        private double solar_lat;
        private double solar_lon;
        private String units;
    }
}
