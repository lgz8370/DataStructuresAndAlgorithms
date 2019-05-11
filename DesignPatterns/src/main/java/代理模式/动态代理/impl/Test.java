package 代理模式.动态代理.impl;


import 代理模式.动态代理.EmployeeService;

/**
 * @author LuGuoZheng
 * @date 2019/5/11 16:58
 * @Version 3.0
 * @description
 */
public class Test {

    public static void main(String[] args) {
        MyTransactionManger tx = new MyTransactionManger();
        EmployeeService employeeService = new EmployeeServiceImpl();

        TransactionManagerHandler handler = new TransactionManagerHandler();

        handler.setMyTransactionManger(tx);
        handler.setTarget(employeeService);

        System.out.println("真实类:" + employeeService);
        EmployeeService proxy = handler.getProxy();
        System.out.println("代理类:" + proxy);

        proxy.save("张三","10年长期合同");

    }
}
