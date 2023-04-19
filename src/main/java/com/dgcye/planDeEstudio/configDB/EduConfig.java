package com.dgcye.planDeEstudio.configDB;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DelegatingDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "eduEntityManagerFactory", 
		transactionManagerRef = "eduTransactionManager", 
		basePackages = {"com.dgcye.planDeEstudio.repoEDU" })
public class EduConfig {
	
	@Autowired
    private Environment env;

	@Bean(name = "eduDataSource")
	@ConfigurationProperties(prefix = "spring.datasourceEdu")
	public DataSource dataSource() {
//		if (env.getProperty("spring.datasourceEdu.jndi-name") != null) {
//			try {
//				return new DelegatingDataSource(
//						(DataSource) new JndiTemplate()
		//                               .lookup(env.getProperty("spring.datasourceEdu.jndi-name")));
//			} catch (NamingException e) {
//				e.printStackTrace();
//				return null;
//			}   
//		} else {
//			return DataSourceBuilder.create().build();
//		}
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName(env.getProperty("edu.datasource.driver-class-name"));
	    dataSource.setUrl(env.getProperty("edu.datasource.url"));
	    dataSource.setUsername(env.getProperty("edu.datasource.username"));
	    dataSource.setPassword(env.getProperty("edu.datasource.password"));
	    return dataSource;
	}

	@Bean(name = "eduEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean eduEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("eduDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource)
				      .packages("com.dgcye.planDeEstudio.modelEDU")
				      .persistenceUnit("edu_test")
				      .build();
	}

	@Bean(name = "eduTransactionManager")
	public PlatformTransactionManager eduTransactionManager(
			@Qualifier("eduEntityManagerFactory") EntityManagerFactory eduEntityManagerFactory) {
		return new JpaTransactionManager(eduEntityManagerFactory);
	}

}
