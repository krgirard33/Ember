package com.nosin.ember.models.data;

import com.nosin.ember.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {
}
