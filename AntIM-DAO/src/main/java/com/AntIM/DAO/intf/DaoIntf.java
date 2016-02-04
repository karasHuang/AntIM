package com.AntIM.DAO.intf;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface DaoIntf<K extends Serializable, T extends Serializable> {

	/**
	 * Save entity
	 * 
	 * @param {@link T} pEntity
	 * @return {@link T}
	 */
	T save(T pEntity);

	/**
	 * Save entities
	 * 
	 * @param {@link Collection}<{@link T}> pEntities
	 */
	void saveAll(Collection<T> pEntities);

	/**
	 * Save or update entity
	 * 
	 * @param <{@link T}> pEntity
	 * @return {@link T}
	 */
	T saveOrUpdate(T pEntity);

	/**
	 * Save or update entities
	 * 
	 * @param {@link Collection}<{@link T}> pEntities
	 */
	void saveOrUpdateAll(Collection<T> pEntities);

	/**
	 * Delete entity
	 * 
	 * @param <{@link T}> pEntity
	 */
	void delete(T pEntity);

	/**
	 * Delete entities
	 * 
	 * @param {@link Collection}<{@link T}> pEntities
	 */
	void deleteAll(Collection<T> pEntities);

	/**
	 * Update entity
	 * 
	 * @param <{@link T}> pEntity
	 * @return {@link T}
	 */
	T update(T pEntity);

	/**
	 * Return the persistent instance of the given entity class with the given
	 * identifier, throwing an exception if not found.
	 * 
	 * @param {@link K} pId
	 * @return {@link T}
	 */
	T find(K pId);

	/**
	 * Return the persistent instance of the given entity class with the given
	 * identifier, throwing an exception if not found.
	 * 
	 * @param {@link Class}<{@link T}> pEntityClass
	 * @param {@link K} pId
	 * @return {@link T}
	 */
	T load(Class<T> pEntityClass, K pId);

	/**
	 * Return the persistent instance of the given entity class with the given
	 * identifier, or null if not found.
	 * 
	 * @param {@link Class}<{@link T}> pEntityClass
	 * @param {@link K} pId
	 * @return {@link T}
	 */
	T get(Class<T> pEntityClass, K pId);

	/**
	 * Return all entities from database
	 * 
	 * @return {@link List}<{@link T}>
	 */
	List<T> findAll();

	/**
	 * Return all entities from database
	 * 
	 * @param {@link Class}<{@link T}> pEntityClass
	 * @return {@link List}<{@link T}>
	 */
	List<T> loadAll(Class<T> pEntityClass);

	/**
	 * Return all entities from database with paginator
	 * 
	 * @param {@link Class}<{@link T}> pEntityClass
	 * @param int pPageSize
	 * @param int pPageIndex
	 * @return {@link List}<{@link T}>
	 */
	List<T> loadAll(Class<T> pEntityClass, int pPageSize, int pPageIndex);

	/**
	 * Return single entity
	 * 
	 * @param {@link List}<{@link T}> pResults
	 * @return {@link T}
	 */
	T getSingleResult(List<T> pResults);

	/**
	 * flush transaction
	 */
	void flush();

}
