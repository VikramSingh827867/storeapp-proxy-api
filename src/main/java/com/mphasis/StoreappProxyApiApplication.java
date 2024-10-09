package com.mphasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.mphasis.filter.Errorfilter;
import com.mphasis.filter.Postfilter;
import com.mphasis.filter.Prefilter;
import com.mphasis.filter.Routefilter;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class StoreappProxyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappProxyApiApplication.class, args);
	}
	
        @Bean
	    Prefilter getPrefilter() {
		return new Prefilter();
		
	}
        
        @Bean
        Postfilter getPostfilter() {
		return new Postfilter();
		
	}
        
        @Bean
        Errorfilter getErrorfilter() {
		return new Errorfilter();
		
	}
        
        @Bean
	    Routefilter getRoutefilter() {
		return new Routefilter();
		
	}
}
