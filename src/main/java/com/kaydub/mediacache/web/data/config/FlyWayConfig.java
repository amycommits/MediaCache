
package com.kaydub.mediacache.web.data.config;

import com.googlecode.flyway.core.Flyway;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author Kevin W.
 */
@Configuration
@PropertySource(value = "classpath:database.properties")
public class FlyWayConfig {

    
    private static final String MC_MIGRATION_DIR = "classpath:db/migration";
    
    @Autowired
    private DataSource mcDataSource;
    
    @Bean(initMethod = "migrate")
    public Flyway flywayMc() {
        Flyway flwy = new Flyway();
        flwy.setDataSource(mcDataSource);
        flwy.setTable("mc_version");
        flwy.setLocations(MC_MIGRATION_DIR);
        flwy.setInitOnMigrate(true);
        return flwy;
    }
}