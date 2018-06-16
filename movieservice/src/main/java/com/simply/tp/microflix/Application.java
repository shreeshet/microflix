package com.simply.tp.microflix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * Created by shreeharshashet on 2/6/18.
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableSpringBootMetricsCollector
//@EnablePrometheusEndpoint
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
