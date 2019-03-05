package com.akp.usermgmt.config;

import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
@Profile("PROD")
public class CloudDataSourceConfiguration extends AbstractCloudConfig{

  @Bean
  public Cloud cloud() {
    return new CloudFactory().getCloud();
  }

  @Bean
  public MongoDbFactory mongoDbFactory() {
      return connectionFactory().mongoDbFactory();
  }
  @Bean
  public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory) {
      return new MongoTemplate(mongoDbFactory);
  }
}