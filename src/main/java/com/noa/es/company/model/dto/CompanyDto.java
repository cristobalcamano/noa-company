package com.noa.es.company.model.dto;

import java.util.List;

public class CompanyDto {


	private Long id;
	private String phone;
	private String address;
	private String logo;
	private String us;
	private String history;
	
	private String email;
	private String termConditions;
	
    private List<CategoryDto> category;
    private List<ImgPrincipalDto> imgPrincipal;
    private List<ImgSecundaryDto> imgSecundary;
    private List<SocialNetworkDto> socialNetwork;
    private List<ScheduleDto> shedule;
	
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
	public List<CategoryDto> getCategory() {
		return category;
	}
	public void setCategory(List<CategoryDto> category) {
		this.category = category;
	}
	public List<ImgPrincipalDto> getImgPrincipal() {
		return imgPrincipal;
	}
	public void setImgPrincipal(List<ImgPrincipalDto> imgPrincipal) {
		this.imgPrincipal = imgPrincipal;
	}
	public List<ImgSecundaryDto> getImgSecundary() {
		return imgSecundary;
	}
	public void setImgSecundary(List<ImgSecundaryDto> imgSecundary) {
		this.imgSecundary = imgSecundary;
	}
	public List<SocialNetworkDto> getSocialNetwork() {
		return socialNetwork;
	}
	public void setSocialNetwork(List<SocialNetworkDto> socialNetwork) {
		this.socialNetwork = socialNetwork;
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
	public List<ScheduleDto> getShedule() {
		return shedule;
	}
	public void setShedule(List<ScheduleDto> shedule) {
		this.shedule = shedule;
	}
	

}
