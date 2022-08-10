package cn.lifesmile.design.combat2;


/**
 * @author shenhuan
 */
public class CheckGoodBindOperation extends AbstractCategoryOperation<Boolean> {

    private Boolean result = false;

    @Override
    protected void doRealExecute(Category category) throws Exception {
        Long id = category.getId();
        Long aLong = DateCache.goodsBind.get(id);
        if (aLong != null) {
            result = true;
        }
    }


    @Override
    public Boolean getResult() {
        return result;
    }


}
