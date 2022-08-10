package cn.lifesmile.design.behavior.access;

/**
 * @author gaopeng
 * @date 2019/12/19 8:49 下午
 */
public class ShowVisitor implements IShowVisitor {
    private String info="";

    @Override
    public void report() {
        System.out.println(this.info);
    }

    @Override
    public void visit(Manager manager) {
        baseReport(manager);
        info = info + "\t业绩：" + manager.getPerformance() + "\n";
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        baseReport(commonEmployee);
        info = info + "\t工作：" + commonEmployee.getJob() + "\n";
    }

    private void baseReport(Employee employee) {
        info = info + "姓名：" + employee.getName() + "\t性别：" + employee.getSex() + "\t工资：" + employee.getSalary();
    }
}
