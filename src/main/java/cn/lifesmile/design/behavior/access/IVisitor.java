package cn.lifesmile.design.behavior.access;


public interface IVisitor {
    void visit(Manager manager);

    void visit(CommonEmployee commonEmployee);
}
