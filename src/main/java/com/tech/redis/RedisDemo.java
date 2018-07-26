package com.tech.redis;

import redis.clients.jedis.Jedis;

/**
 * @author xxx_xx
 * @date 2018/7/27
 */
public class RedisDemo {

    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("xxxx",6379);
        jedis.auth("112233@lsy");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        System.out.println(jedis.get("foo"));
        System.out.println(jedis.get("name"));
        System.out.println(jedis.set("age","10"));
    }
}
