package com.noa.es.company.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.noa.es.company.model.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

	@Query(value = "select c.* from category c where c.company_id = ?1", nativeQuery = true)
	List<Category> findCategoryAllByCompany(Long id);
}
