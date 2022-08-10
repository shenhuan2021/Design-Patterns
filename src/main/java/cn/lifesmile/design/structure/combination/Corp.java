package cn.lifesmile.design.structure.combination;


public abstract class Corp {
    private String name;
    private String phone;
    private String job;

    public Corp(String name, String phone, String job) {
        this.name = name;
        this.phone = phone;
        this.job = job;
    }

    protected String getInfo(){
        System.out.println(this.name);
        System.out.println(this.phone);
        System.out.println(this.job);
        return null;
    }
}
