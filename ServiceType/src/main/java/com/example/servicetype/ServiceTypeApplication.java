package com.example.servicetype;

import com.example.servicetype.Entities.StageType;
import com.example.servicetype.Repository.StageTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ServiceTypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTypeApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StageTypeRepository stageTypeRepository,
                            RepositoryRestConfiguration repositoryRestConfiguration){
        repositoryRestConfiguration.exposeIdsFor(StageType.class);
        return args -> {
            stageTypeRepository.save(new StageType(null,"ouvrier"));
            stageTypeRepository.save(new StageType(null,"technicien"));
            stageTypeRepository.save(new StageType(null,"ingénieur"));
        };
    }

}
