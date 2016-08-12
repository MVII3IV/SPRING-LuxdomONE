package com.luxdom.one.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    private int id;

    @Column(name="serial_number")
    private String serialNumber;

    @Column(name = "relay_number")
    private int relayNumber;

    private String name;

    private int type;

    @Column(name = "pulse_time")
    private Double pulseTime;

    public Device() {
    }

    public Device(int id, String serialNumber, int relayNumber, String name, int type, Double pulseTime) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.relayNumber = relayNumber;
        this.name = name;
        this.type = type;
        this.pulseTime = pulseTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getRelayNumber() {
        return relayNumber;
    }

    public void setRelayNumber(int relayNumber) {
        this.relayNumber = relayNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Double getPulseTime() {
        return pulseTime;
    }

    public void setPulseTime(Double pulseTime) {
        this.pulseTime = pulseTime;
    }
}
