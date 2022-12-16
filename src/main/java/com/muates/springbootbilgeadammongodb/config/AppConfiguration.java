package com.muates.springbootbilgeadammongodb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@ComponentScan
@EnableMongoRepositories("com.muates.springbootbilgeadammongodb.repository")
@Configuration
public class AppConfiguration {

}
