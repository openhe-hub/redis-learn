package org.example;

import redis.clients.jedis.Jedis;

public class BasicDemo {
    private Jedis jedis;

    public BasicDemo(){
        this.jedis = new Jedis("127.0.0.1", 6379);
        this.jedis.select(0);
    }

    public void demo1(){
        String result = jedis.set("name", "jack");
    }

    public void close(){
        if (jedis != null){
            jedis.close();
        }
    }
}
