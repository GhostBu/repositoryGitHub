//package com.marcofontana.foodlymaven.configurations;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableAutoConfiguration
//@EnableConfigurationProperties(DataSourceProperties.class)
//@EnableJpaRepositories(
//        basePackages = "com.marcofontana.foodlymaven.repositories",
//        entityManagerFactoryRef = "foodlyEntityManagerFactory",
//        transactionManagerRef = "foodlyTransactionManager"
//)
//public class DatabaseConfig {
//
//    private final DataSourceProperties dataSourceProperties;
//    private final JpaProperties jpaProperties;
//
//    public DatabaseConfig(DataSourceProperties dataSourceProperties, JpaProperties jpaProperties) {
//        this.dataSourceProperties = dataSourceProperties;
//        this.jpaProperties = jpaProperties;
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        return DataSourceBuilder
//                .create()
//                .url(dataSourceProperties.getUrl())
//                .username(dataSourceProperties.getUsername())
//                .password(dataSourceProperties.getPassword())
//                .driverClassName(dataSourceProperties.getDriverClassName())
//                .build();
//    }
//
//    @Bean( name = "foodlyEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//            EntityManagerFactoryBuilder builder, DataSource dataSource) {
//        return builder
//                .dataSource(dataSource)
//                .packages("com.marcofontana.foodlymaven.entities") // Package where your entities are located
//                .properties(jpaProperties.getProperties())
//                .persistenceUnit("foodlyPersistenceUnit")
//                .build();
//    }
//
//    @Bean(name = "foodlyTransactionManager") // Definizione del bean del TransactionManager
//    public PlatformTransactionManager transactionManager(EntityManagerFactoryBuilder builder, DataSource dataSource) {
//        return new JpaTransactionManager(entityManagerFactory(builder, dataSource).getObject());
//    }
//}
