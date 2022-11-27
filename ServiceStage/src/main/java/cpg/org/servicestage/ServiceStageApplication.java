package cpg.org.servicestage;

import cpg.org.servicestage.Entities.Stage;
import cpg.org.servicestage.Repository.StageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ServiceStageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceStageApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StageRepository stageRepository,
                            RepositoryRestConfiguration repositoryRestConfiguration){
        repositoryRestConfiguration.exposeIdsFor(Stage.class);
        return args -> {

        };
    }

}
