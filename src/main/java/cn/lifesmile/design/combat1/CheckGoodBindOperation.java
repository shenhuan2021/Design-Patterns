package cn.lifesmile.design.combat1;

import java.util.List;

/**
 * @author shenhuan
 */
public class CheckGoodBindOperation implements CategoryOperation<Boolean> {

    private Boolean result = false;

    private CategoryDao categoryDao;

    public CheckGoodBindOperation() {
        this.categoryDao = new CategoryDao();
    }


    @Override
    public Boolean doExecute(Category category) throws Exception {

        Long id = category.getId();

        Long aLong = DateCache.goodsBind.get(id);
        if (aLong != null) {
            result = true;
            return true;
        }

        List<Category> categories = categoryDao.selectChildren(id);
        if (categories != null && categories.size() > 0) {
            for (Category cate : categories) {
                cate.execute(this);
            }
        }
        return false;
    }


    public Boolean getResult() {
        return result;
    }


}
