package cn.lifesmile.design.behavior.access;

/**
 * @author gaopeng
 * @date 2019/12/19 8:39 下午
 */
public interface IVisitor {
    void visit(Manager manager);

    void visit(CommonEmployee commonEmployee);
}
