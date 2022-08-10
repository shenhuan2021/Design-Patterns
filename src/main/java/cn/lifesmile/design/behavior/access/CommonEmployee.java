package cn.lifesmile.design.behavior.access;

/**
 * @author gaopeng
 * @date 2019/12/19 8:41 下午
 */
public class CommonEmployee extends Employee {
    private String job;

    public CommonEmployee(int salary, String name, int sex, String job) {
        super(salary, name, sex);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
