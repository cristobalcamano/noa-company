package com.noa.es.company.model.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Company implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String phone;
	private String address;
	private String logo;
	private String us;
	private String history;

	private String email;
	@Column(name="terms_conditions")
	private String termConditions;
	
	@OneToMany(mappedBy="company")
    private List<Category> category;
	
	@OneToMany
    @JoinColumn(name = "company_id")
    private List<ImgPrincipal> imgPrincipal;

	@OneToMany
    @JoinColumn(name = "company_id")
    private List<ImgSecundary> imgSecundary;
	
	@OneToMany
    @JoinColumn(name = "company_id")
    private List<SocialNetwork> socialNetwork;
	
	@OneToMany
    @JoinColumn(name = "company_id") // we need to duplicate the physical information
    private List<Schedule> schedule;

	public Company() {
		super();
	}

	public Company(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getUs() {
		return us;
	}

	public void setUs(String us) {
		this.us = us;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public List<ImgPrincipal> getImgPrincipal() {
		return imgPrincipal;
	}

	public void setImgPrincipal(List<ImgPrincipal> imgPrincipal) {
		this.imgPrincipal = imgPrincipal;
	}

	public List<ImgSecundary> getImgSecundary() {
		return imgSecundary;
	}

	public void setImgSecundary(List<ImgSecundary> imgSecundary) {
		this.imgSecundary = imgSecundary;
	}

	public List<SocialNetwork> getSocialNetwork() {
		return socialNetwork;
	}

	public void setSocialNetwork(List<SocialNetwork> socialNetwork) {
		this.socialNetwork = socialNetwork;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTermConditions() {
		return termConditions;
	}

	public void setTermConditions(String termConditions) {
		this.termConditions = termConditions;
	}

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
