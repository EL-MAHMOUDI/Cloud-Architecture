package org.mahmoudi.dao;

import org.mahmoudi.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface CompanyRepository extends JpaRepository<Company, Long>{

}
