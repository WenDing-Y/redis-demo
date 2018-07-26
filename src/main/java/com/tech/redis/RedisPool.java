package com.tech.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author xxx_xx
 * @date 2018/7/27
 * redis 连接池
 */
public class RedisPool {
    static JedisPool pool;

    static {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(5);
        pool = new JedisPool(config, "xxxxx", 6379, 10000, "112233@lsy");
        System.out.println(pool.isClosed());
    }

    public static Jedis getRedisConnect() {
       return pool.getResource();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (getRedisConnect() != null) {
                System.out.println("拿到一个redis连接");
            }
        }
    }
}
