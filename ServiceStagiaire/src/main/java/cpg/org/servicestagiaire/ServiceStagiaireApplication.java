package cpg.org.servicestagiaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceStagiaireApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceStagiaireApplication.class, args);
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
