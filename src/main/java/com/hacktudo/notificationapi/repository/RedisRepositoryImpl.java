package com.hacktudo.notificationapi.repository;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Set;

@Repository
public class RedisRepositoryImpl implements RedisRepository {

    private StringRedisTemplate stringRedisTemplate;
    private ValueOperations valueOperations;

    public RedisRepositoryImpl(StringRedisTemplate stringRedisTemplate){
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @PostConstruct
    private void init(){
        valueOperations = stringRedisTemplate.opsForValue();
    }

    @Override
    public void incr(String key) {
        valueOperations.increment(key,1);
    }

    @Override
    public Object get(String key) {
        return valueOperations.get(key);
    }

    @Override
    public Set<String> keys(String pattern) {
        return stringRedisTemplate.keys(pattern);
    }
}
