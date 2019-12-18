package com.yunkakeji.alibabademo.modeles.bean;


import com.yunkakeji.alibabademo.net.basic.NetBasicResp;

/**
 * 修改数据返回实体
 */
public class BaseResultBean extends NetBasicResp {

    /**
     * msg : ok
     */
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
