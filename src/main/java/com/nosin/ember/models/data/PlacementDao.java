package com.nosin.ember.models.data;

import com.nosin.ember.models.Placement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface PlacementDao extends CrudRepository<Placement, Integer> {
    }
