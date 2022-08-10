package cn.lifesmile.design.combat1;

import java.util.List;

/**
 * @author shenhuan
 * @Description 删除分类操作
 * @Date 2022/8/9 4:20 下午
 */
public class RemoveCategoryOperation implements CategoryOperation<Boolean> {


    private CategoryDao categoryDao;

    public RemoveCategoryOperation() {
        this.categoryDao = new CategoryDao();
    }


    @Override
    public Boolean doExecute(Category category) throws Exception {
        Long id = category.getId();
        categoryDao.removeById(id);
        List<Category> categories = categoryDao.selectChildren(id);
        if (categories != null && categories.size() > 0) {
            for (Category cate : categories) {
                cate.execute(this);
            }
        }
        return true;
    }
}
