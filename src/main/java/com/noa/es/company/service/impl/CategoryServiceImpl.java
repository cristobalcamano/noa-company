package com.noa.es.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.noa.es.company.model.dto.CategoryDto;
import com.noa.es.company.model.entity.Category;
import com.noa.es.company.model.entity.Company;
import com.noa.es.company.model.repository.CategoryRepository;
import com.noa.es.company.service.CategoryService;
import com.noa.es.company.util.TransformutilNoa;

@Component
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository car;

	@Override
	public Boolean editCategory(Category c) throws Exception {
		Category cEdit = car.findById(c.getId()).orElse(null);
		if(cEdit == null) {
			throw new Exception("the category does not exist. Consulte al administrador");
		}
		if(c.getName() != null && !c.getName().equals("")) {
			cEdit.setName(c.getName());
		}
		if(c.getDescription() != null && !c.getDescription().equals("")) {
			cEdit.setDescription(c.getDescription());
		}
		car.save(cEdit);
		return true;
	}

	@Override
	public List<CategoryDto> findCategoryAllByCompany(Long companyId) throws Exception {
		return TransformutilNoa.transformCategoryListtoDto(car.findCategoryAllByCompany(companyId));
	}

	@Override
	public CategoryDto findCategoryById(Long id) throws Exception {
		Category c = car.findById(id).orElse(null);
		if(c == null) {
			throw new Exception("the category does not exist");
		}
		return TransformutilNoa.transformCategorytoDto(c);
	}

	@Override
	public Boolean createCategory(Long idCompany, Category c) throws Exception {
		try {
			c.setCompany(new Company(idCompany));
			car.save(c);
			
			return true;
		} catch (Exception e) {
			throw new Exception("Error en la creación de la categoria.");
		}
	}
	

}
