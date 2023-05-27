package com.noa.es.company.service;

import java.util.List;

import com.noa.es.company.model.dto.CompanyDto;
import com.noa.es.company.model.entity.Company;


public interface CompanyService {
	
    public List<CompanyDto> findCompanyAll() throws Exception;
	
	public CompanyDto findCompany(Long id) throws Exception;
	
	public Boolean editCompany(Company c) throws Exception;
	
	public Boolean createCompany(Company c) throws Exception;

}
