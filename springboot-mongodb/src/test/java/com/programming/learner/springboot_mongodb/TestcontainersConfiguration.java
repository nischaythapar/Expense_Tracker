package com.programming.learner.springboot_mongodb;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@TestConfiguration
@Testcontainers
public class TestcontainersConfiguration {

	@Container
	@ServiceConnection
	static MongoDBContainer mongoDBContainer =
			new MongoDBContainer("mongo:7.0");

}
