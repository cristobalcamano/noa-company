package com.noa.es.company.model.dto;

import java.util.List;

public class CategoryDto {

	private Long id;
	private String name;
	private String Description;
	private CompanyDto company;
    private List<ImgCategoryDto> imgcategory;
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public CompanyDto getCompany() {
		return company;
	}
	public void setCompany(CompanyDto company) {
		this.company = company;
	}
	public List<ImgCategoryDto> getImgcategory() {
		return imgcategory;
	}
	public void setImgcategory(List<ImgCategoryDto> imgcategory) {
		this.imgcategory = imgcategory;
	}
    

}
