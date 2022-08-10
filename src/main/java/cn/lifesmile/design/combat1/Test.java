package cn.lifesmile.design.combat1;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author shenhuan
 */
@Slf4j
public class Test {
    /**
     * 测试删除
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Long categoryId = 2L;

        CategoryService categoryService = new CategoryService();
        Boolean bind = categoryService.checkGoodBind(categoryId);
        if (bind) {
            log.info("绑定商品，不能删除分类.....");
        }

        if (!bind) {
            log.info("未绑定商品，进行删除.......");
            Map<Long, Category> data = DateCache.data;
            log.info("before:{}", data);
            categoryService.remove(categoryId);
            log.info("after:{}", data);
        }
    }


}
