package 代理模式.动态代理.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author LuGuoZheng
 * @date 2019/5/11 16:45
 * @Version 3.0
 * @description
 */
public class TransactionManagerHandler implements InvocationHandler {

    // 真实对象
    private Object target;

    // 事务对象
    private MyTransactionManger tx;

    public void setTarget(Object target) {
        this.target = target;
    }

    public void setMyTransactionManger(MyTransactionManger tx) {
        this.tx = tx;
    }

    // 获取代理对象
    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        tx.begin();
        try {
            result = method.invoke(target,args);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
        return result;
    }

}
