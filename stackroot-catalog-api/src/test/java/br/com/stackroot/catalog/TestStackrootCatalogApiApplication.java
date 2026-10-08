package br.com.stackroot.catalog;

import org.springframework.boot.SpringApplication;

public class TestStackrootCatalogApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(StackrootCatalogApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
