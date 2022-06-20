package com.maxprogramer.api.satelites.model;

import com.maxprogramer.api.satelites.dto.SateliteDto;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "satelite_tb")
@Data
public class SateliteModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSatelite;
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

    public SateliteModel() {
    }

    public SateliteModel(int id, String name, double latitude, double longitude, double altitude, double velocity, String visibility, double footprint, int timestamp, double daynum, double solar_lat, double solar_lon, String units) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.velocity = velocity;
        this.visibility = visibility;
        this.footprint = footprint;
        this.timestamp = timestamp;
        this.daynum = daynum;
        this.solar_lat = solar_lat;
        this.solar_lon = solar_lon;
        this.units = units;
    }

    public void updateSatelite(SateliteDto sateliteDto) {
        this.id = sateliteDto.getId();
        this.name = sateliteDto.getName();
        this.latitude = sateliteDto.getLatitude();
        this.longitude = sateliteDto.getLongitude();
        this.altitude = sateliteDto.getAltitude();
        this.velocity = sateliteDto.getVelocity();
        this.visibility = sateliteDto.getVisibility();
        this.footprint = sateliteDto.getFootprint();
        this.timestamp = sateliteDto.getTimestamp();
        this.daynum = sateliteDto.getDaynum();
        this.solar_lat = sateliteDto.getSolar_lat();
        this.solar_lon = sateliteDto.getSolar_lon();
        this.units = sateliteDto.getUnits();
    }

    @Override
    public String toString() {
        return "SateliteModel{" +
                "idSatelite=" + idSatelite +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                ", velocity=" + velocity +
                ", visibility='" + visibility + '\'' +
                ", footprint=" + footprint +
                ", timestamp=" + timestamp +
                ", daynum=" + daynum +
                ", solar_lat=" + solar_lat +
                ", solar_lon=" + solar_lon +
                ", units='" + units + '\'' +
                '}';
    }
}
