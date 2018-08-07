package io.pivotal.spring.data.replication;

public interface ReplicatedRepository<T, K> {
	T save(T entity);
}
