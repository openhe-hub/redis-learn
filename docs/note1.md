# Redis Note 1
## NoSQL
* no structure
* no connection
* no sql
* base (transaction ACID not satisfied)
* multi-type: k-v(Redis), document(MongoDB), graph(Neo4j)
## Redis
* key-value
* based on memory => fast speed
* single-thread
* support data backup (memory => disk)
* support multi-node, cluster, master-slave mode
## Redis Basic
* use redis-cli to interact with redis in terminal
### Data Structure
1. String
2. Hash: `{name: "xxx", age: 10}`
3. List: `[A -> B -> C]`
4. Set: `{A, B, C}`
5. SortedSet: `{A:1, B:2, C:3}`
### Commands
1. `help@cmd-type`
2. Common commands
    * `KEYS pattern`: find keys with given pattern
    * `DEL key1 key2 ...`: rm keys
    * `EXISTS key`: judge key if exist
    * `EXPIRE key seconds`: set key expire time
    * `TTL key`: query left-expire time (-1 ever, -2 expired)
3. String
    * `SET key val`: add or upd
    * `GET key`: query
    *   `MSET k1 v1 k2 v2`: add or upd batch
    * `MGET k1 k2 k3`: query batch
    * `INCR key`: increase 1
    * `INCRBY key num`: increase num
    * `INCREBYFLOAT key num`: increase float
    * `SETNX`: purely add
    * `SETEX`: add & set expire time
4. key rule: `project`:`transaction`:`type`:`id`
5. Hash
   * `HSET key field val`
   * `HGET key field`
   * `HMSET key f1 v1 f2 v2`
   * `HMGET key f1 f2 f3`
   * `HGETALL`: get all fields && data
   * `HKEYS`: get all field name
   * `HVALS`: get all value
   * `HSETNX`: add new field
6. List: similar to double-orientation linked list 
   * `LPUSH key elem`
   * `LPOP key`
   * `RPUSH key elem`
   * `RPOP key`
   * `LRANGE key start end`: query data
7. Set: similar to hashset
   * `SADD key member`: add elem into set
   * `SREM key member`: rm
   * `SCARD key`: num
   * `SISMEMBER key member`
   * `SMEMBERS`: query all
   * `SINTER k1 k2`: integrated set
   * `SDIFF k1 k2`: diff set
   * `SUNION k1 k2`: union set
8. SortedSet: skiplist + hashset
   * `ZADD key score mem`
   * `ZREM key member`
   * `ZSCORE key member`
   * `ZRANK key member`
   * `ZCARD key`
   * `ZDIFF/ZINTER/ZUNION`
   * `ZRANGE key min max`
   