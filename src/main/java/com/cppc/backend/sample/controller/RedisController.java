package com.cppc.backend.sample.controller;

import com.cppc.backend.sample.domain.GiftProvider;
import com.cppc.backend.sample.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/get")
    public GiftProvider get(int id) {
        return redisService.get(id);
    }

    @RequestMapping("/put")
    public GiftProvider put(int id, String name) {
        return redisService.put(id, name);
    }

    @RequestMapping("/getAll")
    public List<GiftProvider> getAll() {
        return redisService.getAll();
    }

}