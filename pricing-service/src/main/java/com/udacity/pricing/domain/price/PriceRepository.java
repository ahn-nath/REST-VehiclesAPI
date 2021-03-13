package com.udacity.pricing.domain.price;
import org.springframework.data.repository.CrudRepository;


/**
 * Access CRUD operations related to Price.
 */
public interface PriceRepository extends CrudRepository<Price, Long> {

}
