package com.noa.es.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noa.es.company.model.entity.Company;
import com.noa.es.company.service.CompanyService;


@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("${application.api.path}")
public class ApiCompany {

	@Autowired
	private CompanyService c;
	
	@PostMapping("/")
	public ResponseEntity<?> save(@RequestBody Company company) {
		try {
			return new ResponseEntity<>(c.createCompany(company),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/")
	public ResponseEntity<?> companyGetall(){
		try {
			return new ResponseEntity<>(c.findCompanyAll(),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findCompanyById(@PathVariable Long id) {
		try {
			return new ResponseEntity<>(c.findCompany(id),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/")
	public ResponseEntity<?> update(@RequestBody Company company) {
		try {
			return new ResponseEntity<>(c.editCompany(company),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}	
	}

}
