package xyz.gabrielaraujo.fundamentos.fundamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= "xyz.gabrielaraujo.fundamentos")
public class FundamentosApplication {
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

}
