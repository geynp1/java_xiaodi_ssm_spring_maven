package net.xdclass.sp.proxy;

public class PayServiceImpl implements PayService{

    @Override
    public String callback(String outTradeNo) {
        System.out.println("Ŀ���� PayServiceImpl �ص� ���� callback");
        return outTradeNo;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("Ŀ���� PayServiceImpl �ص� ���� save");
        return productId;
    }
}
