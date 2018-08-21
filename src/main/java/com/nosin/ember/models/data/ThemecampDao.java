package com.nosin.ember.models.data;

import com.nosin.ember.models.Themecamp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface ThemecampDao extends CrudRepository<Themecamp, Integer> {

}
