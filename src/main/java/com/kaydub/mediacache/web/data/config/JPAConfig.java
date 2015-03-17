
package com.kaydub.mediacache.web.data.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Kevin W.
 */
@Configuration
@EnableJpaRepositories
@EnableTransactionManagement
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
    
    @Bean
    public LocalContainerEntityManagerFactoryBean iasoEntityManagerFactory(DataSource mcDataSource, JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(mcDataSource);
        factory.setJpaVendorAdapter(jpaVendorAdapter);
        factory.setPackagesToScan("com.kaydub.mediacache.web.data.entities");
        return factory;
    }
    

}