package com.cppc.backend.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class WelcomeController {
    private final static String REDIS_KEY = "ms";

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource(name = "redisTemplate")
    private ValueOperations<String, Object> valueOperations;

    @RequestMapping("/")
    public String welcome(){

        redisTemplate.opsForValue().set(REDIS_KEY,1);

        /*System.out.println(getVisitCount());*/
        return "index.html";
    }

  /*  public Long getVisitCount() {
        Visit visit = new Visit();
        visit.setCount(1);
        visit.setStartAt(new Date());
        int sum = 0;
        visitRepository.save(visit);

        List list  = (List)visitRepository.findAll();
        for (int i=0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }


        return 1L;
    }*/

}
