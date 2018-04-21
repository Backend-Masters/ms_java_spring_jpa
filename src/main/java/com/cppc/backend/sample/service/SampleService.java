package com.cppc.backend.sample.service;

import com.cppc.backend.sample.domain.Sample;
import com.cppc.backend.sample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018-04-21.
 */
@Service
public class SampleService {

    @Autowired
    private SampleRepository sampleRepository;

    public Object getInfoService(){

        return sampleRepository.findAll();
    }



}
