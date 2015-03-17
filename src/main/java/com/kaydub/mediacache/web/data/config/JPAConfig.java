
package com.kaydub.mediacache.web.data.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 *
 * @author Kevin W.
 */
@Configuration
public class JPAConfig {
    
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter hibernateVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateVendorAdapter.setDatabase(Database.MYSQL);
        hibernateVendorAdapter.setShowSql(false);
        hibernateVendorAdapter.setGenerateDdl(true);
        hibernateVendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL5InnoDBDialect");
        return hibernateVendorAdapter;
    }
    
    
    @Bean 
    public JdbcTemplate jdbcTemplate(DataSource mcDataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(mcDataSource);
        return jdbcTemplate;
    }

}