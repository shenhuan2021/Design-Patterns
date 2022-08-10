package cn.lifesmile.design.combat2;

import java.util.List;

/**
 * @author shenhuan
 */
public abstract class AbstractCategoryOperation<T> implements CategoryOperation<T> {

    protected CategoryDao categoryDao;

    public AbstractCategoryOperation() {

        this.categoryDao = new CategoryDao();
    }

    @Override
    public T doExecute(Category category) throws Exception {
        doExecuteForChildren(category);
        doRealExecute(category);
        return getResult();
    }


    private void doExecuteForChildren(Category category) throws Exception {
        List<Category> categories = categoryDao.selectChildren(category.getId());
        if (categories != null && categories.size() > 0) {
            for (Category child : categories) {
                //Category childCategory = new Category(child.getId());
                child.execute(this);
            }
        }
    }

    /**
     * 执行实际的操作
     *
     * @param category 类目
     * @throws Exception
     */
    protected abstract void doRealExecute(Category category) throws Exception;

    /**
     * 获取操作的执行结果
     *
     * @return 操作的执行结果
     * @throws Exception
     */
    protected abstract T getResult() throws Exception;
}
