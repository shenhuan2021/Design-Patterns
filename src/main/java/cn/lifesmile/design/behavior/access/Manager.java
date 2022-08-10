package cn.lifesmile.design.behavior.access;

/**
 * @author gaopeng
 * @date 2019/12/19 8:40 下午
 */
public class Manager extends Employee {
    private String performance;

    public Manager(int salary, String name, int sex, String performance) {
        super(salary, name, sex);
        this.performance = performance;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
