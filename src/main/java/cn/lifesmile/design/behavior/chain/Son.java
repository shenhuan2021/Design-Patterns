package cn.lifesmile.design.behavior.chain;


public class Son extends Handler {
    private int level;

    public Son() {
        this.level = 3;
    }

    @Override
    protected int getHandlerLevel() {
        return this.level;
    }

    @Override
    protected Response echo(Request request) {
        System.out.println(request.getMessage());
        return new Response("同意");
    }
}
