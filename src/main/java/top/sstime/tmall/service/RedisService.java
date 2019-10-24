package top.sstime.tmall.service;

/**
 * @author chenwei
 * @create_time 2019/10/24 2:55 下午
 * @descriptions redis操作service
 * 对象和数组都以json的形式储存
 */
public interface RedisService {
    /**
     * 存储数据
     */
    void set(String key, String value);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置超期时间
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     * @param delta 自增步长
     */
    Long increment(String key, long delta);
}
