package edu.uic.cs.cs442.model;

/**
 * Created by thomasdutta on 2/16/17.
 */

import javax.persistence.*;


@Entity
@Table(name = "crimeDetails")
public class CrimeRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String caseNumber;
    private String floating_timestamp;
    private String block;
    private String iucr;
    private String primary_type;
    private String description;
    private String location_description;
    private String arrest;
    private String domestic;
    private String beat;
    private String district;
    private String ward;
    private String fbi_code;
    private String community_area;
    private String x_coordinate;
    private String y_coordinate;
    private String year;
    private String updated_on;
    private String latitude;
    private String longitude;
    private String location;

    public CrimeRecord() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getFloating_timestamp() {
        return floating_timestamp;
    }

    public void setFloating_timestamp(String floating_timestamp) {
        this.floating_timestamp = floating_timestamp;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getIucr() {
        return iucr;
    }

    public void setIucr(String iucr) {
        this.iucr = iucr;
    }

    public String getPrimary_type() {
        return primary_type;
    }

    public void setPrimary_type(String primary_type) {
        this.primary_type = primary_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation_description() {
        return location_description;
    }

    public void setLocation_description(String location_description) {
        this.location_description = location_description;
    }

    public String getArrest() {
        return arrest;
    }

    public void setArrest(String arrest) {
        this.arrest = arrest;
    }

    public String getDomestic() {
        return domestic;
    }

    public void setDomestic(String domestic) {
        this.domestic = domestic;
    }

    public String getBeat() {
        return beat;
    }

    public void setBeat(String beat) {
        this.beat = beat;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getFbi_code() {
        return fbi_code;
    }

    public void setFbi_code(String fbi_code) {
        this.fbi_code = fbi_code;
    }

    public String getCommunity_area() {
        return community_area;
    }

    public void setCommunity_area(String community_area) {
        this.community_area = community_area;
    }

    public String getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(String x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public String getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(String y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(String updated_on) {
        this.updated_on = updated_on;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
