package cn.lifesmile.design.behavior.chain;


public abstract class Handler {

    private Handler nextHandler;

    public final Response handlerMessage(Request request){
        Response response;
        if(request.getType()==getHandlerLevel()){
            response = echo(request);
        }else if(this.nextHandler!=null){
            response = this.nextHandler.echo(request);
        }else{
            response = null;
        }
        return response;
    }

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }

    protected abstract int getHandlerLevel();

    protected abstract Response echo(Request request);

}
