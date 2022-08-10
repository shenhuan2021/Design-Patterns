package cn.lifesmile.design.structure.combination;

import java.util.ArrayList;
import java.util.List;


public class Branch extends Corp {
    private List<Corp> subList = new ArrayList<>();

    public Branch(String name, String phone, String job) {
        super(name, phone, job);
    }

    public void addSub(Corp corp){
        this.subList.add(corp);
    }

    public List<Corp> getSubList(){
        return this.subList;
    }
}
