package net.xdclass.sp.proxy;

public interface PayService {

    /**
     * ֧���ص�
     * @param outTradeNo
     * @return
     */
    String callback(String outTradeNo);

    /**
     * �µ�
     * @param userId
     * @param productId
     * @return
     */
    int save(int userId, int productId);
}
