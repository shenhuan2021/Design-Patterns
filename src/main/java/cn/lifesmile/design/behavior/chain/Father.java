package cn.lifesmile.design.behavior.chain;


public class Father extends Handler {
    private int level;

    public Father() {
        this.level = 1;
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
