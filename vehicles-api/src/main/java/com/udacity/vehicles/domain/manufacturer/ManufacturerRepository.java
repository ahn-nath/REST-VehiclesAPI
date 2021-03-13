package com.udacity.vehicles.domain.manufacturer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * 
 * Extension of CrudRepository that provides some other JPA-specific methods
 *
 */
@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {

}
