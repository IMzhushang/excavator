package com.googlecode.excavator.protocol;

import java.io.Serializable;

/**
 * rmi调用协议:请求
 *
 * @author vlinux
 *
 */
public final class RmiRequest extends RmiTracer implements Serializable {

    private static final long serialVersionUID = 823825583753849024L;

    private String key;			//group+version+sign
    private String group;			//服务分组
    private String version;		//服务版本
    private String sign;			//服务签名
    private Serializable[] args;	//传递参数
    private String appName;		//消费端应用名
    private long timeout;			//请求超时时长

//    /**
//     * 构造rmi请求
//     *
//     * @param group
//     * @param version
//     * @param sign
//     * @param args
//     * @param appName
//     * @param timeout
//     */
//    public RmiRequest(
//            String group, String version, String sign,
//            Serializable[] args, String appName, long timeout) {
//        this.group = group;
//        this.version = version;
//        this.sign = sign;
//        this.args = args;
//        this.appName = appName;
//        this.timeout = timeout;
//        this.key = group + version + sign;
//    }
//
//    /**
//     * rmi请求:转发用<br/>
//     * 通过此构造函数出来的请求对象将会携有指定的token
//     *
//     * @param token
//     * @param group
//     * @param version
//     * @param sign
//     * @param args
//     * @param appName
//     * @param timeout
//     */
//    public RmiRequest(String token, String group, String version, String sign,
//            Serializable[] args, String appName, long timeout) {
//        super(token);
//        this.group = group;
//        this.version = version;
//        this.sign = sign;
//        this.args = args;
//        this.appName = appName;
//        this.timeout = timeout;
//        this.key = group + version + sign;
//    }
    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setArgs(Serializable[] args) {
        this.args = args;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public String getAppName() {
        return appName;
    }

    public String getGroup() {
        return group;
    }

    public String getVersion() {
        return version;
    }

    public String getSign() {
        return sign;
    }

    public Serializable[] getArgs() {
        return args;
    }

    public long getTimeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return String.format("REQ[token=%s;group=%s;version=%s;sign=%s;consumer=%s;timeout=%s;]",
                getToken(), group, version, sign, appName, timeout);
    }

}
