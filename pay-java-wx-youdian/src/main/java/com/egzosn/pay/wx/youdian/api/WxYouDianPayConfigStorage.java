package com.egzosn.pay.wx.youdian.api;

import java.util.concurrent.locks.ReentrantLock;

import com.egzosn.pay.common.api.BasePayConfigStorage;

/**
 * 支付客户端配置存储
 *
 * @author egan
 * <p>
 * email egzosn@gmail.com
 * date 2017/01/12 22:58
 */
public class WxYouDianPayConfigStorage extends BasePayConfigStorage {


    /**
     * 账号
     */
    public String seller;


    @Override
    public String getAppid() {
        return null;
    }

    /**
     * 应用id
     * 纠正名称
     *
     * @return 应用id
     */
    @Override
    public String getAppId() {
        return null;
    }


    @Override
    public String getPid() {
        return null;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    @Override
    public String getSeller() {
        return seller;
    }


    public void setToken(String accessToken) {
        setAccessToken(accessToken);
    }

    @Override
    public String getToken() {
        return getAccessToken();
    }

    public WxYouDianPayConfigStorage() {
        setAccessTokenLock(new ReentrantLock());
    }
}
