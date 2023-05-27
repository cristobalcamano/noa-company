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

import com.noa.es.company.model.entity.Category;
import com.noa.es.company.service.CategoryService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("${application.api.path}")
public class ApiCategory {
	
	@Autowired
	private CategoryService c;

	@PostMapping("/{id}/category")
	public ResponseEntity<?> save(@RequestBody Category category, @PathVariable Long id) {
		try {
			return new ResponseEntity<>(c.createCategory(id, category),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/{id}/category")
	public ResponseEntity<?> categoryGetall(@PathVariable Long id){
		try {
			return new ResponseEntity<>(c.findCategoryAllByCompany(id),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/category/{id}")
	public ResponseEntity<?> findCategoryById(@PathVariable Long id) {
		try {
			return new ResponseEntity<>(c.findCategoryById(id),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/category")
	public ResponseEntity<?> update(@RequestBody Category category) {
		try {
			return new ResponseEntity<>(c.editCategory(category),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}	
	}
	
	
}
