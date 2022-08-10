package cn.lifesmile.design.combat2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shenhuan
 * @Description 模拟数据库
 * @Date 2022/8/9 4:37 下午
 */
public class DateCache {

    public static Map<Long, Category> data = new HashMap();

    public static Map<Long, Long> goodsBind = new HashMap<>();

    static {

        data.put(1L, new Category(1L, null, "ID1"));
        data.put(2L, new Category(2L, null, "ID2"));
        data.put(3L, new Category(3L, 1L, "ID3"));
        data.put(4L, new Category(4L, 1L, "ID4"));
        data.put(5L, new Category(5L, 1L, "ID5"));
        data.put(6L, new Category(6L, 5L, "ID6"));
        data.put(7L, new Category(7L, 5L, "ID7"));

        goodsBind.put(6L, 6L);
    }



}
