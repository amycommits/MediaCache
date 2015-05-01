package com.kaydub.mediacache.web.data.entities.settings;

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
@Table(name = "APP_SETTINGS")
public class AppSetting implements Serializable{
    @Id
    @Column(name="KEY", length=255)
    private String key;
    
     @Column(name="value", length=255)
    private String value;
    
   // @OneToMany(mappedBy="key", fetch = FetchType.LAZY)
  
      public String getKey() {
        return key;
    } 
    public String getValue() {
        return value;
    } 
    
    public void setKey(String key) {
        this.key = key;
    }
       
    public void setValue(String value) {
        this.value = value;
    }
}
