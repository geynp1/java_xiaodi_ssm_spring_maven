package net.xdclass.sp.proxy;

public class StaticProxyPayServiceImpl implements PayService{


    private PayService payService;
    public StaticProxyPayServiceImpl(PayService payService){
        this.payService = payService;
    }
    @Override
    public String callback(String outTradeNo) {
        System.out.println("StaticProxyPayServiceImpl callback begin");
        String result = payService.callback(outTradeNo);
        System.out.println("StaticProxyPayServiceImpl callback end");
        return result;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("StaticProxyPayServiceImpl save begin");
        int id = payService.save(userId,productId);
        System.out.println("StaticProxyPayServiceImpl save end");
        return id;
    }
}
