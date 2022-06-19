package com.maxprogramer.api.satelites.dto;

import com.maxprogramer.api.satelites.model.SateliteModel;
import lombok.Data;

@Data
public class SateliteDto {

    private int id;
    private String name;

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

    public SateliteModel novoSatelite() {
        return new SateliteModel(id, name, latitude, longitude, altitude, velocity, visibility,
                footprint, timestamp, daynum, solar_lat, solar_lon, units);
    }

}
