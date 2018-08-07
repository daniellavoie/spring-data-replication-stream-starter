package io.pivotal.spring.data.replication.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataReplicationSampleApplication implements CommandLineRunner {
	private CustomerProfileRepository customerProfileRepository;

	public SpringDataReplicationSampleApplication(CustomerProfileRepository customerProfileRepository) {
		this.customerProfileRepository = customerProfileRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataReplicationSampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerProfileRepository.save(new CustomerProfile(1l));
	}
}
