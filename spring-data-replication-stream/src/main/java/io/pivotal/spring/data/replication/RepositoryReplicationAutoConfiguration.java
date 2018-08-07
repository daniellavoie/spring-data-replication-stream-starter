package io.pivotal.spring.data.replication;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(repositoryBaseClass = ReplicatedJpaRepository.class)
public class RepositoryReplicationAutoConfiguration {

}
