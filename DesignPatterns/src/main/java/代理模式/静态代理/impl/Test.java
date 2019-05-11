package 代理模式.静态代理.impl;

/**
 * @author LuGuoZheng
 * @date 2019/5/9 11:01
 * @Version 3.0
 * @description 测试
 *
 *
 */
public class Test {

    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        EmployeeProxyImpl employeeProxy = new EmployeeProxyImpl();
        MyTransactionManger myTransactionManger = new MyTransactionManger();
        employeeProxy.setMyTransactionManger(myTransactionManger);

        employeeProxy.setTarget(employeeService);

        employeeProxy.save(" 张三 ","10长期合同~!");
    }
}
