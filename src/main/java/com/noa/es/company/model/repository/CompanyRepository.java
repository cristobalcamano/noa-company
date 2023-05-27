package com.noa.es.company.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.noa.es.company.model.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
