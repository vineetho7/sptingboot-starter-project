package com.vineeth.contentcalender;

import com.vineeth.contentcalender.config.ContentCalenderProperties;
import com.vineeth.contentcalender.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
@EnableConfigurationProperties(ContentCalenderProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=  SpringApplication.run(Application.class, args);

		RestTemplate restTemplate= (RestTemplate) context.getBean("restTemplate");
		//System.out.println(restTemplate);
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

//		@Bean
//		 CommandLineRunner  commandLineRunner(ContentRepository repository ) {
//			return args-> System.out.println("hello");
//
//		}


	}

}
