package com.codestates.practicegithubActiondeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.codestates.practicegithubActiondeploy.controller")
public class PracticeGithubActionDeployApplication {

	public static void main(String[] args) {

		SpringApplication.run(PracticeGithubActionDeployApplication.class, args);
	}

}
