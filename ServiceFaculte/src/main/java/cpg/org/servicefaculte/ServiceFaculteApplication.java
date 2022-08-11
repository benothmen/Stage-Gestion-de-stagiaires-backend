package cpg.org.servicefaculte;

import cpg.org.servicefaculte.Entities.Faculte;
import cpg.org.servicefaculte.Repository.FaculteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ServiceFaculteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFaculteApplication.class, args);
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
