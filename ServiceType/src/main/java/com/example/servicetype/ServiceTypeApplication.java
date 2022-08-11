package com.example.servicetype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceTypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTypeApplication.class, args);
    }

//    @Bean
//    CommandLineRunner start(FaculteRepository faculteRepository,
//                            RepositoryRestConfiguration repositoryRestConfiguration){
//        repositoryRestConfiguration.exposeIdsFor(Faculte.class);
//        return args -> {
//
//        };
//    }

}
