package cn.lifesmile.design.combat1;

/**
 * @author shenhuan
 */
public interface CategoryOperation<T> {

    /**
     * 执行
     *
     * @param category
     * @return
     * @throws Exception
     */
    T doExecute(Category category) throws Exception;
}
