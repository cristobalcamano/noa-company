package com.noa.es.company.util;

import java.util.ArrayList;
import java.util.List;

import com.noa.es.company.model.dto.CategoryDto;
import com.noa.es.company.model.dto.CompanyDto;
import com.noa.es.company.model.dto.ImgCategoryDto;
import com.noa.es.company.model.dto.ImgPrincipalDto;
import com.noa.es.company.model.dto.ImgSecundaryDto;
import com.noa.es.company.model.dto.ScheduleDto;
import com.noa.es.company.model.dto.SocialNetworkDto;
import com.noa.es.company.model.entity.Category;
import com.noa.es.company.model.entity.Company;
import com.noa.es.company.model.entity.ImgCategory;
import com.noa.es.company.model.entity.ImgPrincipal;
import com.noa.es.company.model.entity.ImgSecundary;
import com.noa.es.company.model.entity.Schedule;
import com.noa.es.company.model.entity.SocialNetwork;

public class TransformutilNoa {

	public static List<CompanyDto> transformCompanyListtoDto(List<Company> cList) {
		List<CompanyDto> response = new ArrayList<>();

		if (cList == null) {
			return null;
		}

		for (Company c : cList) {
			response.add(transformCompanytoDto(c));
		}

		return response;
	}

	public static CompanyDto transformCompanytoDto(Company c) {
		CompanyDto companyDto = new CompanyDto();

		companyDto.setAddress(c.getAddress());
		companyDto.setCategory(transformCategoryListtoDto(c.getCategory()));
		companyDto.setHistory(c.getHistory());
		companyDto.setId(c.getId());
		
		companyDto.setEmail(c.getEmail());
		companyDto.setTermConditions(c.getTermConditions());
		
		companyDto.setImgPrincipal(transformImgPrimarytoDto(c.getImgPrincipal()));
		companyDto.setImgSecundary(transformImgSecundarytoDto(c.getImgSecundary()));
		companyDto.setLogo(c.getLogo());
		companyDto.setPhone(c.getPhone());
		companyDto.setSocialNetwork(transformSocialNetworktoDto(c.getSocialNetwork()));
		companyDto.setUs(c.getUs());
		companyDto.setShedule(transformScheduleListToScheduleDtoList(c.getSchedule()));
		

		return companyDto;
	}

	public static List<CategoryDto> transformCategoryListtoDto(List<Category> cList) {
		List<CategoryDto> response = new ArrayList<>();

		if (cList == null) {
			return null;
		}

		for (Category c : cList) {

			response.add(transformCategorytoDto(c));
		}

		return response;
	}

	public static CategoryDto transformCategorytoDto(Category c) {
		CategoryDto categoryDto = new CategoryDto();

		categoryDto.setDescription(c.getDescription());
		categoryDto.setId(c.getId());
		categoryDto.setImgcategory(transformImgCategoryDto(c.getImgcategory()));
		categoryDto.setName(c.getName());

		return categoryDto;
	}

	public static List<ImgSecundaryDto> transformImgSecundarytoDto(List<ImgSecundary> iList) {
		List<ImgSecundaryDto> response =  new ArrayList<>();
		
		if (iList == null) {
			return null;
		}
		for(ImgSecundary i: iList) {
			ImgSecundaryDto imgS = new ImgSecundaryDto();
			imgS.setId(i.getId());
			imgS.setUrl(i.getUrl());
			response.add(imgS);
		}
		
		return response;
	}
	
	public static List<ImgPrincipalDto> transformImgPrimarytoDto(List<ImgPrincipal> iList) {
		List<ImgPrincipalDto> response =  new ArrayList<>();
		
		if (iList == null) {
			return null;
		}
		for(ImgPrincipal i: iList) {
			ImgPrincipalDto imgS = new ImgPrincipalDto();
			imgS.setId(i.getId());
			imgS.setUrl(i.getUrl());
			response.add(imgS);
		}
		
		return response;
	}
	
	public static List<SocialNetworkDto> transformSocialNetworktoDto(List<SocialNetwork> iList) {
		List<SocialNetworkDto> response =  new ArrayList<>();
		
		if (iList == null) {
			return null;
		}
		for(SocialNetwork i: iList) {
			SocialNetworkDto imgS = new SocialNetworkDto();
			imgS.setId(i.getId());
			imgS.setUrl(i.getUrl());
			imgS.setName(i.getName());
			imgS.setLogo(i.getLogo());
			response.add(imgS);
		}
		
		return response;
	}
	
	public static List<ImgCategoryDto> transformImgCategoryDto(List<ImgCategory> iList) {
		List<ImgCategoryDto> response =  new ArrayList<>();
		
		if (iList == null) {
			return null;
		}
		for(ImgCategory i: iList) {
			ImgCategoryDto imgS = new ImgCategoryDto();
			imgS.setId(i.getId());
			imgS.setUrl(i.getUrl());
			response.add(imgS);
		}
		
		return response;
	}
	
	public static List<ScheduleDto> transformScheduleListToScheduleDtoList(List<Schedule> s) {
		List<ScheduleDto> response = new ArrayList();
		for(Schedule i: s) {
			response.add(transformScheduleToScheduleDto(i));
		}
		return response;
	}
	
	public static ScheduleDto transformScheduleToScheduleDto(Schedule s) {
		ScheduleDto response = new ScheduleDto();
		response.setId(s.getId());
		response.setLabel(s.getLabel());
		response.setValue(s.getValue());
		return response;
	}
	
	

}
