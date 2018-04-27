package com.kylin.electricassistsys.pojo.tbbcx;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TDljsFhyc extends Model<TDljsFhyc> {

    private static final long serialVersionUID = 1L;

    private String tFhycId;
    private String tFhycYhmc;
    private String tFhycDydj;
    private String tFhycLsfh;
    private String tFhycYcnf;
    private String tFhycFhyc;


    public String gettFhycId() {
        return tFhycId;
    }

    public void settFhycId(String tFhycId) {
        this.tFhycId = tFhycId;
    }

    public String gettFhycYhmc() {
        return tFhycYhmc;
    }

    public void settFhycYhmc(String tFhycYhmc) {
        this.tFhycYhmc = tFhycYhmc;
    }

    public String gettFhycDydj() {
        return tFhycDydj;
    }

    public void settFhycDydj(String tFhycDydj) {
        this.tFhycDydj = tFhycDydj;
    }

    public String gettFhycLsfh() {
        return tFhycLsfh;
    }

    public void settFhycLsfh(String tFhycLsfh) {
        this.tFhycLsfh = tFhycLsfh;
    }

    public String gettFhycYcnf() {
        return tFhycYcnf;
    }

    public void settFhycYcnf(String tFhycYcnf) {
        this.tFhycYcnf = tFhycYcnf;
    }

    public String gettFhycFhyc() {
        return tFhycFhyc;
    }

    public void settFhycFhyc(String tFhycFhyc) {
        this.tFhycFhyc = tFhycFhyc;
    }

    @Override
    protected Serializable pkVal() {
        return this.tFhycId;
    }

    @Override
    public String toString() {
        return "TDljsFhyc{" +
        "tFhycId=" + tFhycId +
        ", tFhycYhmc=" + tFhycYhmc +
        ", tFhycDydj=" + tFhycDydj +
        ", tFhycLsfh=" + tFhycLsfh +
        ", tFhycYcnf=" + tFhycYcnf +
        ", tFhycFhyc=" + tFhycFhyc +
        "}";
    }
}
