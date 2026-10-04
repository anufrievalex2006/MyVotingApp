package com.example.voting;

import org.springframework.boot.SpringApplication;

public class TestVotingApplication {

	public static void main(String[] args) {
		SpringApplication.from(VotingApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
