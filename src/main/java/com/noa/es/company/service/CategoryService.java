package com.noa.es.company.service;

import java.util.List;
import com.noa.es.company.model.dto.CategoryDto;
import com.noa.es.company.model.entity.Category;

public interface CategoryService {
	
	public List<CategoryDto> findCategoryAllByCompany(Long companyId) throws Exception;
	
	public CategoryDto findCategoryById(Long id) throws Exception;
	
	public Boolean editCategory (Category c) throws Exception;
	
	public Boolean createCategory (Long idCompany,Category c) throws Exception;

}
