package cpg.org.servicespecialite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceSpecialiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSpecialiteApplication.class, args);
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
