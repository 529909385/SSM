package com.kylin.electricassistsys.pojo.jcsj;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 资料类型
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjZylx extends Model<TJcsjZylx> {

    private static final long serialVersionUID = 1L;

    private String tZllxId;
    private String tZllxName;
    private String tZllxRemark;


    public String gettZllxId() {
        return tZllxId;
    }

    public void settZllxId(String tZllxId) {
        this.tZllxId = tZllxId;
    }

    public String gettZllxName() {
        return tZllxName;
    }

    public void settZllxName(String tZllxName) {
        this.tZllxName = tZllxName;
    }

    public String gettZllxRemark() {
        return tZllxRemark;
    }

    public void settZllxRemark(String tZllxRemark) {
        this.tZllxRemark = tZllxRemark;
    }

    @Override
    protected Serializable pkVal() {
        return this.tZllxId;
    }

    @Override
    public String toString() {
        return "TJcsjZylx{" +
        "tZllxId=" + tZllxId +
        ", tZllxName=" + tZllxName +
        ", tZllxRemark=" + tZllxRemark +
        "}";
    }
}
