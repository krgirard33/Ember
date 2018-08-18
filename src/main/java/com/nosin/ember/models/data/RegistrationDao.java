package com.nosin.ember.models.data;

import com.nosin.ember.models.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface RegistrationDao extends CrudRepository<Registration, Integer> {
}
