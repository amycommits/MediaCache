/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaydub.mediacache.web.data.entities.songs;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
/**
 *
 * @author AMY
 */
@Entity
@Table(name = "SONG_LOCATION")
public class SongLocation implements Serializable {

 @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
 
 @Id
    @Column(name="ID")
    private Integer song_id;
    
    @Id
    @Column(name="LOCATION")
    private String location;
    
    @Cascade({CascadeType.ALL })
   
    public Integer getId() {
        return song_id;
    }

    public void setId(String id) {
        this.song_id = song_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
