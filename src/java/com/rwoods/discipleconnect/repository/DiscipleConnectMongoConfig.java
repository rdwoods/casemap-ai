package com.rwoods.discipleconnect.repository;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.rwoods.discipleconnect.repository")
@PropertySource("classpath:application.properties")
public class DiscipleConnectMongoConfig {

    @Value("${spring.data.mongodb.uri}")
    private String mongoDbConnectUrl;

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        MongoClientURI mongoClientURI = new MongoClientURI(mongoDbConnectUrl);
        MongoClient mongoClient = new MongoClient(mongoClientURI);
        return new SimpleMongoDbFactory(mongoClient, "heroku_74qcjqtf");
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }
}