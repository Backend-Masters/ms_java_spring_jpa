package com.cppc.backend.sample.controller;

import com.cppc.backend.sample.domain.Sample;
import com.cppc.backend.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2018-04-21.
 */

@RestController
@EnableAutoConfiguration
public class SampleController {

    @Autowired
    private SampleService service;

    @RequestMapping("/getInfo")
    public List<Sample> sample(){
        List<Sample> list = (List)service.getInfoService();
        System.out.println(list);
        return list;
    }

    @RequestMapping("/test1")
    public String test(){
        return"ASDF";
    }

    @RequestMapping("/bob")
    String home() {
        return "Spongebob";
    }

}
