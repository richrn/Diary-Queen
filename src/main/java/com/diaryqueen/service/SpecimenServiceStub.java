package com.diaryqueen.service;

import org.springframework.stereotype.Component;

import com.diaryqueen.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {

	@Override
	public SpecimenDTO fetchById (int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLatitude("39.1");
		specimenDTO.setLongitude("84.5");
		specimenDTO.setDescription("A beautiful Eastern Redbud");
		
		return specimenDTO;
	}
	
	@Override
	public void save(SpecimenDTO SpecimenDTO) {
		
	}
}
