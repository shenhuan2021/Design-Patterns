package cn.lifesmile.design.behavior.chain;


public class Husband extends Handler {
    private int level;

    public Husband() {
        this.level = 2;
    }

    @Override
    protected int getHandlerLevel() {
        return this.level;
    }

    @Override
    protected Response echo(Request request) {
        System.out.println(request.getMessage());
        return new Response("不同意");
    }
}
