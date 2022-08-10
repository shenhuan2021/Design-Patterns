package cn.lifesmile.design.combat2;


import java.util.List;

/**
 * 分类Service
 *
 * @author shawn
 */
public class CategoryService {


    /**
     * 根据ID删除分类
     *
     * @param id
     * @return
     */
    Boolean remove(Long id) throws Exception {
        Category category = new Category(id);

        CategoryOperation removeCategoryOperation = new RemoveCategoryOperation();

        category.execute(removeCategoryOperation);

        return true;
    }

    /**
     * 根据id 查询分类树
     *
     * @param id
     * @return
     */
    Boolean checkGoodBind(Long id) throws Exception {
        Category category = new Category(id);
        CheckGoodBindOperation checkGoodBindOperation = new CheckGoodBindOperation();
        category.execute(checkGoodBindOperation);
        Boolean result = checkGoodBindOperation.getResult();
        return result;
    }

    List<Category> selectTree(Long id) throws Exception {
        return null;
    }
}
