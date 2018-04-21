package com.cppc.backend.sample.repository;

import com.cppc.backend.sample.domain.Sample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018-04-21.
 */
@Repository
public interface SampleRepository extends CrudRepository<Sample,Long> {

}
