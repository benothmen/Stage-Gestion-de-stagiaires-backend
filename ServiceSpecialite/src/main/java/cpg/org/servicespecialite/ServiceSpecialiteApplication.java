package cpg.org.servicespecialite;

import cpg.org.servicespecialite.Entities.Specialite;
import cpg.org.servicespecialite.Repository.SpecialiteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ServiceSpecialiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSpecialiteApplication.class, args);
    }

    @Bean
    CommandLineRunner start(SpecialiteRepository specialiteRepository,
                            RepositoryRestConfiguration repositoryRestConfiguration){
        repositoryRestConfiguration.exposeIdsFor(Specialite.class);
        return args -> {
            specialiteRepository.save(new Specialite(null,"aa"));
            specialiteRepository.save(new Specialite(null,"bb"));
        };
    }

}
