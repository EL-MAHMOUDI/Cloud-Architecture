package org.mahmoudi;

import java.util.List;
import java.util.stream.Stream;

import org.mahmoudi.dao.CompanyRepository;
import org.mahmoudi.entities.Company;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CompanyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CompanyRepository companyRespsitory) {
		return args->{
			Stream.of("Vermeg","Infor","SopraHR","FIS").forEach(companyName->{
				companyRespsitory.save(new Company(null,companyName,100+Math.random()*1000));
			});
			companyRespsitory.findAll().forEach(System.out::println);
		};
	}
}
