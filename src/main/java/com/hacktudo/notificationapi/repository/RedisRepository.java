package com.hacktudo.notificationapi.repository;

import java.util.Set;

public interface RedisRepository {
    void incr(String key);
    Object get(String key);
    Set<String> keys(String pattern);
}
