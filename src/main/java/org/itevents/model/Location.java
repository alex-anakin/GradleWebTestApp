package org.itevents.model;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

public class Location implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement
    private float latitude;
    @XmlElement
    private float longitude;

    public Location() {
    }

    public Location(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
