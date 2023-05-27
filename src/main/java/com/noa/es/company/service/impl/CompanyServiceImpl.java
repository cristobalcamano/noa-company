package com.noa.es.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.noa.es.company.model.dto.CompanyDto;
import com.noa.es.company.model.entity.Company;
import com.noa.es.company.model.repository.CompanyRepository;
import com.noa.es.company.service.CompanyService;
import com.noa.es.company.util.TransformutilNoa;

@Component
public class CompanyServiceImpl implements CompanyService {
	
	
	@Autowired
	private CompanyRepository cr;
	
	@Override
	public List<CompanyDto> findCompanyAll() throws Exception {
		return TransformutilNoa.transformCompanyListtoDto(cr.findAll());
	}

	@Override
	public CompanyDto findCompany(Long id) throws Exception {
		Company c = cr.findById(id).orElse(null);
		if(c == null) {
			throw new Exception("the company does not exist");
		}
		return TransformutilNoa.transformCompanytoDto(c);
	}

	@Override
	public Boolean editCompany(Company c) throws Exception {
		Company cEdit = cr.findById(c.getId()).orElse(null);
		if(cEdit == null) {
			throw new Exception("the company does not exist. Consulte al administrador");
		}
		if(c.getAddress() != null && !c.getAddress().equals("")) {
			cEdit.setAddress(c.getAddress());
		}
		if(c.getName() != null && !c.getName().equals("")) {
			cEdit.setName(c.getName());
		}
		if(c.getHistory() != null && !c.getHistory().equals("")) {
			cEdit.setHistory(c.getHistory());
		}
		if(c.getLogo() != null && !c.getLogo().equals("")) {
			cEdit.setLogo(c.getLogo());
		}
		if(c.getPhone() != null && !c.getPhone().equals("")) {
			cEdit.setPhone(c.getPhone());
		}
		if(c.getUs() != null && !c.getUs().equals("")) {
			cEdit.setUs(c.getUs());
		}
		cr.save(cEdit);
		return true;
	}

	@Override
	public Boolean createCompany(Company p) throws Exception {
		try {
			cr.save(p);
			return true;
		} catch (Exception e) {
			throw new Exception("Error en la creación de la empresa.");
		}
	}

}
