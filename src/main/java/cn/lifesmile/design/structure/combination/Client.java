package cn.lifesmile.design.structure.combination;

import java.util.List;


public class Client {
    public static void main(String[] args) {
        Branch ceo = new Branch("老大","111","ceo");
        Branch devBranch = new Branch("研发大哥","222","研发部");
        Branch caiwuBranch = new Branch("老会计","333","会计");
        Leaf a = new Leaf("a","a","dev1");
        Leaf b = new Leaf("b","b","dev2");
        Leaf c = new Leaf("c","c","c");
        ceo.addSub(devBranch);
        ceo.addSub(caiwuBranch);
        devBranch.addSub(a);
        devBranch.addSub(b);
        caiwuBranch.addSub(c);
        ceo.getInfo();
        print(ceo.getSubList());

    }

    private static void print(List<Corp> list){
        for (Corp corp : list) {
            if(corp instanceof Leaf){
                corp.getInfo();
            }else{
                Branch b = (Branch)corp;
                b.getInfo();
                print(b.getSubList());
            }
        }
    }
}
