package io.pivotal.spring.data.replication;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class ReplicatedJpaRepository<T, ID> extends SimpleJpaRepository<T, ID> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ReplicatedJpaRepository.class);

	public ReplicatedJpaRepository(JpaEntityInformation<T, ID> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
	}

	@Override
	public <S extends T> S save(S entity) {
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("Saving " + entity + ".");
		}

		return super.save(entity);
	}
}
