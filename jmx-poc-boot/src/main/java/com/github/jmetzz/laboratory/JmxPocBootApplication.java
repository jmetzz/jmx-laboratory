package com.github.jmetzz.laboratory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmxPocBootApplication {
	/*
	 All objects defined as Spring bean by means of spring annotations will only be pick up
	 when their respective package is included in a component scan.
	 A default behavior of Spring Boot when using the @SpringBootApplication annotation is
	 to perform a package scan on its package (and all sub packages).
	 Because the application class (this one) resides in the package com.github.jmetzz.laboratory,
	 the annotated Spring Components in the child packages are automatically found by Spring.
	 If they were in a different package tree, I would need to explicitly tell Spring Boot to scan that package.
	 */
	public static void main(String[] args) {
		SpringApplication.run(JmxPocBootApplication.class , args);
	}
}
