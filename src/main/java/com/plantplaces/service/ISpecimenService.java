package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;


/**
 * CRUD operation for Specimens
 * @author Administrator
 *
 */
public interface ISpecimenService {

	/**
	 * Get Specimens from persistence layer
	 * @param id a unique lookup
	 * @return a specimen with a matching ID
	 */
	SpecimenDTO fetchById(int id);

	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 *
	 */
	void save(SpecimenDTO SpecimenDTO);

}