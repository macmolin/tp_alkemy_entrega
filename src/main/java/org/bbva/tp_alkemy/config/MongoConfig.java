package org.bbva.tp_alkemy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "org.bbva.tp_alkemy.repository")

public class MongoConfig {
}
