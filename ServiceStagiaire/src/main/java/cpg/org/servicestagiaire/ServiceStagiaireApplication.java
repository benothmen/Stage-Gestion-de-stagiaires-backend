package cpg.org.servicestagiaire;

import cpg.org.servicestagiaire.Entities.Stagiaire;
import cpg.org.servicestagiaire.Repository.StagiaireRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ServiceStagiaireApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceStagiaireApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StagiaireRepository stagiaireRepository,
                            RepositoryRestConfiguration repositoryRestConfiguration){
        repositoryRestConfiguration.exposeIdsFor(Stagiaire.class);
        return args -> {

        };
    }

}
