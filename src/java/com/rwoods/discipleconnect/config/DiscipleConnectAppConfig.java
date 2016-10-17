package com.rwoods.discipleconnect.config;

/**
 * Created by rahmanwoods on 10/13/16.
 */

import com.rwoods.discipleconnect.repository.DiscipleConnectMongoConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.rwoods.discipleconnect")
@Import( {DiscipleConnectMongoConfig.class} )
public class DiscipleConnectAppConfig {

}