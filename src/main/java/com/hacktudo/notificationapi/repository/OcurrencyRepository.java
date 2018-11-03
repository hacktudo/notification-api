package com.hacktudo.notificationapi.repository;

import com.hacktudo.notificationapi.model.Ocurrency;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcurrencyRepository extends CrudRepository<Ocurrency, Integer> {

}
