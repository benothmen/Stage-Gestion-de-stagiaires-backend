package cpg.org.servicelieu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceLieuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLieuApplication.class, args);
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
