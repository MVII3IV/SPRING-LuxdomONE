package com.luxdom.one.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "states")
public class State {

    @Id
    @Column(name = "device_id")
    private int deviceId;

    private int type;

    private Boolean status;

    public State() {
    }

    public State(int deviceId, int type, Boolean status) {
        this.deviceId = deviceId;
        this.type = type;
        this.status = status;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
