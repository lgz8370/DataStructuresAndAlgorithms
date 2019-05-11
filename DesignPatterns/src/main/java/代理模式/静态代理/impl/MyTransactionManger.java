package 代理模式.静态代理.impl;

/**
 * @author LuGuoZheng
 * @date 2019/5/9 11:17
 * @Version 3.0
 * @description 事务
 */
public class MyTransactionManger {

    public void begin(){
        System.out.println("开启事务");
    }

    public void  rollback(){
        System.out.println("回滚事务");
    }

    public void commit(){
        System.out.println("提交事务");
    }
}

