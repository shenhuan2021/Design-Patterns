package cn.lifesmile.design.combat2;

import java.util.List;

/**
 * @author shenhuan
 * @Description 删除分类操作
 * @Date 2022/8/9 4:20 下午
 */
public class RemoveCategoryOperation extends AbstractCategoryOperation<Boolean> {

    @Override
    protected void doRealExecute(Category category) throws Exception {
        categoryDao.removeById(category.getId());
    }

    @Override
    protected Boolean getResult() throws Exception {
        return true;
    }
}
