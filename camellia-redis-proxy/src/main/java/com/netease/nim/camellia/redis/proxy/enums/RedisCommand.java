package com.netease.nim.camellia.redis.proxy.enums;

import com.netease.nim.camellia.redis.proxy.util.Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caojiajun on 2019/11/18.
 */
public enum RedisCommand {

    /**
     * FULL_SUPPORT
     */
    PING(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    AUTH(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    QUIT(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    COMMAND(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    SCAN(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    SCRIPT(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.SCRIPT, Blocking.FALSE, CommandKeyType.None),
    SET(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GET(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    EXISTS(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    DEL(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    TYPE(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    EXPIRE(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    EXPIREAT(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    TTL(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GETSET(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GETEX(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    MGET(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    SETNX(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GETDEL(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SETEX(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    MSET(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.COMPLEX),
    SUBSTR(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    DECRBY(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    DECR(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    INCRBY(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    INCR(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    APPEND(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HSET(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HGET(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HSETNX(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HMSET(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HMGET(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HINCRBY(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HEXISTS(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HDEL(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HLEN(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HRANDFIELD(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HKEYS(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HVALS(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HGETALL(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    RPUSH(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    LPUSH(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    LLEN(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    LRANGE(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    LTRIM(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    LINDEX(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    LSET(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    LREM(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    LPOP(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    RPOP(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SADD(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SMEMBERS(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SREM(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SPOP(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SCARD(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SISMEMBER(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SRANDMEMBER(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZADD(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZINCRBY(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZRANK(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZCARD(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZSCORE(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SORT(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZCOUNT(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZRANGE(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZRANGEBYSCORE(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZRANGEBYLEX(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZREVRANK(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZREVRANGE(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZREVRANGEBYSCORE(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZREVRANGEBYLEX(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZREM(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZREMRANGEBYRANK(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZREMRANGEBYSCORE(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZREMRANGEBYLEX(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZLEXCOUNT(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZMSCORE(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZPOPMAX(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZPOPMIN(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    STRLEN(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    LPUSHX(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    PERSIST(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    RPUSHX(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    LINSERT(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SETBIT(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GETBIT(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    BITPOS(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SETRANGE(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GETRANGE(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    BITCOUNT(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    PEXPIRE(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    PEXPIREAT(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    PTTL(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    INCRBYFLOAT(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    PSETEX(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    CLIENT(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    HINCRBYFLOAT(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HSCAN(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SSCAN(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZSCAN(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GEOADD(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.GE0, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GEODIST(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.GE0, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GEOHASH(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.GE0, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GEOPOS(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.GE0, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GEORADIUS(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.GE0, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GEORADIUSBYMEMBER(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.GE0, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    GEOSEARCH(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.GE0, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    BITFIELD(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STRING, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ECHO(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    PFADD(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.HYPER_LOG_LOG, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    XACK(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STREAM, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    XADD(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STREAM, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    XCLAIM(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STREAM, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    XDEL(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STREAM, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    XLEN(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STREAM, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    XPENDING(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STREAM, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    XRANGE(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STREAM, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    XREVRANGE(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STREAM, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    XTRIM(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STREAM, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    XGROUP(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.STREAM, Blocking.FALSE, CommandKeyType.COMPLEX),
    XINFO(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.STREAM, Blocking.FALSE, CommandKeyType.COMPLEX),
    UNLINK(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    TOUCH(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    LPOS(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    SMISMEMBER(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    HSTRLEN(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.HASH, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    DUMP(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    RESTORE(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    ZRANDMEMBER(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    BFADD(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.BF, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    BFEXISTS(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.BF, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    BFINFO(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.BF, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    BFINSERT(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.BF, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    BFLOADCHUNK(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.BF, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    BFMADD(CommandSupportType.FULL_SUPPORT, Type.WRITE, CommandType.BF, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    BFMEXISTS(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.BF, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),
    BFSCANDUMP(CommandSupportType.FULL_SUPPORT, Type.READ, CommandType.BF, Blocking.FALSE, CommandKeyType.SIMPLE_SINGLE),

    /**
     * Restrictive Support
     * only support while keys in this command location at the same server or same slot, especially, blocking command don't support multi-write
     */
    EVAL(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.SCRIPT, Blocking.FALSE, CommandKeyType.COMPLEX),
    EVALSHA(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.SCRIPT, Blocking.FALSE, CommandKeyType.COMPLEX),
    EVAL_RO(CommandSupportType.RESTRICTIVE_SUPPORT, Type.READ, CommandType.SCRIPT, Blocking.FALSE, CommandKeyType.COMPLEX),
    EVALSHA_RO(CommandSupportType.RESTRICTIVE_SUPPORT, Type.READ, CommandType.SCRIPT, Blocking.FALSE, CommandKeyType.COMPLEX),
    PFCOUNT(CommandSupportType.RESTRICTIVE_SUPPORT, Type.READ, CommandType.HYPER_LOG_LOG, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    PFMERGE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.HYPER_LOG_LOG, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    RENAME(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    RENAMENX(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.DB, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    SINTER(CommandSupportType.RESTRICTIVE_SUPPORT, Type.READ, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    SINTERSTORE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    SUNION(CommandSupportType.RESTRICTIVE_SUPPORT, Type.READ, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    SUNIONSTORE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    SDIFF(CommandSupportType.RESTRICTIVE_SUPPORT, Type.READ, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    SDIFFSTORE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.SET, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    SMOVE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.SET, Blocking.FALSE, CommandKeyType.COMPLEX),
    ZUNIONSTORE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.COMPLEX),
    ZINTERSTORE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.COMPLEX),
    BITOP(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.COMPLEX),
    MSETNX(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.STRING, Blocking.FALSE, CommandKeyType.COMPLEX),
    BLPOP(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.TRUE, CommandKeyType.COMPLEX),
    BRPOP(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.TRUE, CommandKeyType.COMPLEX),
    BZPOPMAX(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.TRUE, CommandKeyType.COMPLEX),
    BZPOPMIN(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.TRUE, CommandKeyType.COMPLEX),
    RPOPLPUSH(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    BRPOPLPUSH(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.TRUE, CommandKeyType.COMPLEX),
    XREADGROUP(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.STREAM, Blocking.DYNAMIC, CommandKeyType.COMPLEX),
    XREAD(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.STREAM, Blocking.DYNAMIC, CommandKeyType.COMPLEX),
    GEOSEARCHSTORE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.GE0, Blocking.FALSE, CommandKeyType.COMPLEX),
    ZDIFFSTORE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.COMPLEX),
    ZDIFF(CommandSupportType.RESTRICTIVE_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.COMPLEX),
    ZINTER(CommandSupportType.RESTRICTIVE_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.COMPLEX),
    ZUNION(CommandSupportType.RESTRICTIVE_SUPPORT, Type.READ, CommandType.ZSET, Blocking.FALSE, CommandKeyType.COMPLEX),
    ZRANGESTORE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.ZSET, Blocking.FALSE, CommandKeyType.COMPLEX),
    LMOVE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.FALSE, CommandKeyType.COMPLEX),
    BLMOVE(CommandSupportType.RESTRICTIVE_SUPPORT, Type.WRITE, CommandType.LIST, Blocking.TRUE, CommandKeyType.COMPLEX),

    /**
     * Partially Support-1
     * only support while no custom sharding
     */
    SUBSCRIBE(CommandSupportType.PARTIALLY_SUPPORT_1, Type.WRITE, CommandType.PUB_SUB, Blocking.TRUE, CommandKeyType.None),
    PUBLISH(CommandSupportType.PARTIALLY_SUPPORT_1, Type.WRITE, CommandType.PUB_SUB, Blocking.FALSE, CommandKeyType.None),
    UNSUBSCRIBE(CommandSupportType.PARTIALLY_SUPPORT_1, Type.WRITE, CommandType.PUB_SUB, Blocking.FALSE, CommandKeyType.None),
    PSUBSCRIBE(CommandSupportType.PARTIALLY_SUPPORT_1, Type.WRITE, CommandType.PUB_SUB, Blocking.TRUE, CommandKeyType.None),
    PUNSUBSCRIBE(CommandSupportType.PARTIALLY_SUPPORT_1, Type.WRITE, CommandType.PUB_SUB, Blocking.FALSE, CommandKeyType.None),
    PUBSUB(CommandSupportType.PARTIALLY_SUPPORT_1, Type.READ, CommandType.PUB_SUB, Blocking.FALSE, CommandKeyType.None),

    /**
     * Partially Support-2
     * only support while have singleton-upstream(no custom sharding) [redis-standalone or redis-sentinel or redis-cluster]
     */
    MULTI(CommandSupportType.PARTIALLY_SUPPORT_2, Type.WRITE, CommandType.TRANSACTION, Blocking.FALSE, CommandKeyType.None),
    DISCARD(CommandSupportType.PARTIALLY_SUPPORT_2, Type.WRITE, CommandType.TRANSACTION, Blocking.FALSE, CommandKeyType.None),
    EXEC(CommandSupportType.PARTIALLY_SUPPORT_2, Type.WRITE, CommandType.TRANSACTION, Blocking.FALSE, CommandKeyType.None),
    WATCH(CommandSupportType.PARTIALLY_SUPPORT_2, Type.READ, CommandType.TRANSACTION, Blocking.FALSE, CommandKeyType.SIMPLE_MULTI),
    UNWATCH(CommandSupportType.PARTIALLY_SUPPORT_2, Type.READ, CommandType.TRANSACTION, Blocking.FALSE, CommandKeyType.None),

    /**
     * Partially Support-3
     * only support while have singleton-upstream(no custom sharding) [redis-standalone or redis-sentinel]
     */
    KEYS(CommandSupportType.PARTIALLY_SUPPORT_3, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    RANDOMKEY(CommandSupportType.PARTIALLY_SUPPORT_3, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),

    /**
     * Partially Support-4
     * only support in special case or special parameter
     */
    INFO(CommandSupportType.PARTIALLY_SUPPORT_4, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    HELLO(CommandSupportType.PARTIALLY_SUPPORT_4, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    CLUSTER(CommandSupportType.PARTIALLY_SUPPORT_4, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    ASKING(CommandSupportType.PARTIALLY_SUPPORT_4, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    CONFIG(CommandSupportType.PARTIALLY_SUPPORT_4, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),
    SELECT(CommandSupportType.PARTIALLY_SUPPORT_4, Type.READ, CommandType.DB, Blocking.FALSE, CommandKeyType.None),

    /**
     * NOT_SUPPORT
     */
    FLUSHDB(CommandSupportType.NOT_SUPPORT, Type.WRITE, null, Blocking.FALSE, null),
    DBSIZE(CommandSupportType.NOT_SUPPORT, Type.READ, null, Blocking.FALSE, null),
    MOVE(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    FLUSHALL(CommandSupportType.NOT_SUPPORT, Type.WRITE, null, Blocking.FALSE, null),
    SAVE(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    BGSAVE(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    BGREWRITEAOF(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    LASTSAVE(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    SHUTDOWN(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    MONITOR(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    SLAVEOF(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    SYNC(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    DEBUG(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    SLOWLOG(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    OBJECT(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    SENTINEL(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    TIME(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    MIGRATE(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    WAIT(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),
    READONLY(CommandSupportType.NOT_SUPPORT, null, null, Blocking.FALSE, null),

    ;

    private final CommandSupportType supportType;
    private final String strRaw;
    private final byte[] raw;
    private final Type type;
    private final Blocking blocking;
    private final CommandKeyType commandKeyType;
    private final CommandType commandType;

    RedisCommand(CommandSupportType supportType, Type type, CommandType commandType, Blocking blocking, CommandKeyType commandKeyType) {
        if (commandType == CommandType.BF) {
            this.strRaw = "bf." + name().toLowerCase().substring(2);
        } else {
            this.strRaw = name().toLowerCase();
        }
        this.raw = Utils.stringToBytes(this.strRaw);
        this.supportType = supportType;
        this.type = type;
        this.commandType = commandType;
        this.blocking = blocking;
        this.commandKeyType = commandKeyType;
    }

    public byte[] raw() {
        return raw;
    }

    public String strRaw() {
        return strRaw;
    }

    public Type getType() {
        return type;
    }

    public CommandSupportType getSupportType() {
        return supportType;
    }

    public CommandKeyType getCommandKeyType() {
        return commandKeyType;
    }

    public Blocking isBlocking() {
        return blocking;
    }

    public CommandType getCommandType() {
        return commandType;
    }

    public static enum Blocking {
        TRUE,
        FALSE,
        DYNAMIC,
        ;
    }

    public static enum Type {
        READ,
        WRITE,
        ;
    }

    public static enum CommandType {
        DB,
        PUB_SUB,
        STRING,
        HASH,
        LIST,
        ZSET,
        SET,
        STREAM,
        HYPER_LOG_LOG,
        SCRIPT,
        GE0,
        TRANSACTION,
        BF,
        ;
    }

    public static enum CommandSupportType {

        //full support commands
        FULL_SUPPORT(1),

        //only support while keys in this command location at the same server or same slot, especially, blocking command don't support multi-write
        RESTRICTIVE_SUPPORT(2),

        //only support while no custom sharding
        PARTIALLY_SUPPORT_1(3),

        //only support while have singleton-upstream(no custom sharding) [redis-standalone or redis-sentinel or redis-cluster]
        PARTIALLY_SUPPORT_2(4),

        //only support while have singleton-upstream(no custom sharding) [redis-standalone or redis-sentinel]
        PARTIALLY_SUPPORT_3(5),

        //only support in special case or special parameter
        PARTIALLY_SUPPORT_4(6),

        //not support
        NOT_SUPPORT(Integer.MAX_VALUE),
        ;

        private final int value;

        CommandSupportType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static enum CommandKeyType {
        SIMPLE_SINGLE,
        None,
        SIMPLE_MULTI,
        COMPLEX,
        ;
    }

    private static final Map<String, RedisCommand> supportCommandMap = new HashMap<>();
    private static final Map<String, RedisCommand> commandMap = new HashMap<>();

    static {
        for (RedisCommand command : RedisCommand.values()) {
            if (command.getSupportType() != CommandSupportType.NOT_SUPPORT && command.getType() != null) {
                supportCommandMap.put(command.strRaw, command);
            }
            commandMap.put(command.strRaw, command);
        }

    }

    public static RedisCommand getSupportRedisCommandByName(String command) {
        return supportCommandMap.get(command);
    }

    public static RedisCommand getRedisCommandByName(String command) {
        return commandMap.get(command);
    }
}
