package cn.lifesmile.design.behavior.chain;


public class Women implements Request {
    private int type;
    private String message;

    public Women(int type) {
        this.type = type;
        switch (type) {
            case 1:
                this.message = "女儿的请求";
                break;
            case 2:
                this.message = "妻子的请求";
                break;
            case 3:
                this.message = "母亲的请求";
                break;
            default:
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
