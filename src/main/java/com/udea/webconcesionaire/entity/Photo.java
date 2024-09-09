/**
 * This file was generated by the Jeddict
 */
package com.udea.webconcesionaire.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author marit
 */
@Entity(name = "Photo") 
public class Photo {

    @Column(unique = true, nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long photo_id;

    @Basic
    private String url_photo;

    @ManyToOne
    private Vehicle vehicle;

    public Photo(Long photo_id, String url_photo, Vehicle vehicle) {
        this.photo_id = photo_id;
        this.url_photo = url_photo;
        this.vehicle = vehicle;
    }

    public Photo() {
    }

    public Long getPhoto_id() {
        return this.photo_id;
    }

    public void setPhoto_id(Long photo_id) {
        this.photo_id = photo_id;
    }

    public String getUrl_photo() {
        return this.url_photo;
    }

    public void setUrl_photo(String url_photo) {
        this.url_photo = url_photo;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Objects.equals(getClass(), obj.getClass())) {
            return false;
        }
        final Photo other = (Photo) obj;
        if (!java.util.Objects.equals(this.getPhoto_id(), other.getPhoto_id())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.getPhoto_id());
        return hash;
    }

    @Override
    public String toString() {
        return "Photo{" + " photo_id=" + photo_id + ", url_photo=" + url_photo + ", vehicle=" + vehicle + '}';
    }

}