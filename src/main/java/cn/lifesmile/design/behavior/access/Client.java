package cn.lifesmile.design.behavior.access;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Client {
    public static void main(String[] args) {
        IShowVisitor showVisitor = new ShowVisitor();
        TotalVisitor totalVisitor = new TotalVisitor();
        for (Employee employee : mockEmployee()) {
            employee.accept(showVisitor);
            employee.accept(totalVisitor);
        }
        showVisitor.report();
        totalVisitor.totalSalary();
    }

    private static List<Employee> mockEmployee() {
        int size = 3;
        List<Employee> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            if (random.nextBoolean()) {
                list.add(new Manager(10000, "总" + i, 1, "我会拍马屁"));
            } else {
                list.add(new CommonEmployee(8000, "苦力" + i, 2, "搬砖工"));
            }
        }
        return list;
    }
}
