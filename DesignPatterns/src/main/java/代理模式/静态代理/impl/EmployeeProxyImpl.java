package 代理模式.静态代理.impl;

import 代理模式.静态代理.EmployeeService;

/**
 * @author LuGuoZheng
 * @date 2019/5/9 10:34
 * @Version 3.0
 * @description 代理对象
 */
public class EmployeeProxyImpl implements EmployeeService {

    /**
     * 真实对象
     */
    private EmployeeService target;

    private MyTransactionManger myTransactionManger;

    public void setTarget(EmployeeService target){
        this.target = target;
    }

    public void setMyTransactionManger(MyTransactionManger myTransactionManger){
        this.myTransactionManger = myTransactionManger;
    }

    /**
     * 签订合同
     *
     * @param name     姓名
     * @param contract 合同
     */
    @Override
    public void save(String name, String contract) {

        myTransactionManger.begin();
        try {

            // 真实对象只负责签订合同
            target.save(name,contract);

            // TODO 签订合同后处理一系列其他问题

            myTransactionManger.commit();
        } catch (Exception e) {
            myTransactionManger.rollback();
            e.printStackTrace();
        }
    }
}
