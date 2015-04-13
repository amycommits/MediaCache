package com.kaydub.mediacache.web.beans.dba;

import java.io.Serializable;

/**
 *
 * @author AMY
 */
public class AppSettings implements Serializable {
    private String appSettings;
    
    public String getAppSettings(){
        return appSettings;        
    }
    
    public void setAppSettings(String appSettings){
        this.appSettings = appSettings;        
    }
    
}
