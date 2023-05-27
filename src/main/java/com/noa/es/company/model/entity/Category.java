package com.noa.es.company.model.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Category implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String Description;

	@ManyToOne
    @JoinColumn(name="company_id", nullable=false)
    private Company company;
	
	@OneToMany
    @JoinColumn(name = "category_id")
    private List<ImgCategory> imgcategory;

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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<ImgCategory> getImgcategory() {
		return imgcategory;
	}

	public void setImgcategory(List<ImgCategory> imgcategory) {
		this.imgcategory = imgcategory;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
