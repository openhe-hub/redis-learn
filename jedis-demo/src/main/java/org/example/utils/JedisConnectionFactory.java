package org.example.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;


public class JedisConnectionFactory {
    private static final JedisPool jedisPool;

    static {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(10);
        config.setMaxIdle(8);
        config.setMinIdle(0);
        config.setMaxWait(Duration.ofMillis(1000));
        jedisPool = new JedisPool(config, "127.0.0.1", 6379, 1000);
    }

    public static Jedis getJedis() {
        return jedisPool.getResource();
    }
}
