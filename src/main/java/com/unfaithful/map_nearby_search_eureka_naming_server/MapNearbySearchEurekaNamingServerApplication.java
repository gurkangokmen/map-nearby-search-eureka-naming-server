package com.unfaithful.map_nearby_search_eureka_naming_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class MapNearbySearchEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapNearbySearchEurekaNamingServerApplication.class, args);
	}

}
