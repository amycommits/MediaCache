
package com.kaydub.mediacache.web.data.entities.media.music;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Kevin W.
 */
@Entity
@Table(name = "SONGS")
public class Song {
    
    
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
