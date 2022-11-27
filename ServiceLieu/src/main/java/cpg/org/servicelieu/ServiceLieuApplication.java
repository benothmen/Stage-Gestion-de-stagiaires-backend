package cpg.org.servicelieu;

import cpg.org.servicelieu.Entities.Lieu;
import cpg.org.servicelieu.Repository.LieuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ServiceLieuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLieuApplication.class, args);
    }

    @Bean
    CommandLineRunner start(LieuRepository lieuRepository,
                            RepositoryRestConfiguration repositoryRestConfiguration){
        repositoryRestConfiguration.exposeIdsFor(Lieu.class);
        return args -> {
            lieuRepository.save(new Lieu(null,"aaaa"));
            lieuRepository.save(new Lieu(null,"bbbb"));
        };
    }

}
