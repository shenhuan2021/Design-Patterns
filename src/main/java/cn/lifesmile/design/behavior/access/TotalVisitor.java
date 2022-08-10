package cn.lifesmile.design.behavior.access;

/**
 * @author gaopeng
 * @date 2019/12/19 8:56 下午
 */
public class TotalVisitor implements ITotalVisitor {
    private static final int COMMON = 2;
    private static final int MANAGER = 5;
    private static int COMMON_TOTAL = 0;
    private static int MANAGER_TOTAL = 0;

    @Override
    public void totalSalary() {
        System.out.println("总工资为：" + COMMON_TOTAL + MANAGER_TOTAL);
    }

    @Override
    public void visit(Manager manager) {
        MANAGER_TOTAL = manager.getSalary() * MANAGER + MANAGER_TOTAL;
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        COMMON_TOTAL = commonEmployee.getSalary() * COMMON + COMMON_TOTAL;
    }
}
