package cn.lifesmile.design.behavior.access;


public abstract class Employee {
    private int salary;
    private String name;
    private int sex;

    public Employee(int salary, String name, int sex) {
        this.salary = salary;
        this.name = name;
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public abstract void accept(IVisitor visitor);
}
