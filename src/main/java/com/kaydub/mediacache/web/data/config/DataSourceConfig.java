
package com.kaydub.mediacache.web.data.config;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Kevin W.
 */
@Configuration
@PropertySource("classpath:database.properties")
@EnableTransactionManagement
public class DataSourceConfig {
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://192.168.60.7:3306/";
    private static final String autoconnect = "?autoReconnect=true";
    @Value("${database.database}")
    private String mcdb;
    @Value("${database.user}")
    private String user;
    @Value("${database.password}")
    private String passwd;
    
    @Bean 
    public DataSource mcDataSource() {
        BasicDataSource src = new BasicDataSource();
        StringBuilder str = new StringBuilder();
        str.append(url).append(mcdb).append(autoconnect);
        src.setDriverClassName(driver);
        src.setUrl(str.toString());
        src.setUsername(user);
        src.setPassword(passwd);
        src.setInitialSize(4);
        src.setMinEvictableIdleTimeMillis(600000);
        src.setTimeBetweenEvictionRunsMillis(300000);
        return src;
    }
}