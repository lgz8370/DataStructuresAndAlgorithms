package 代理模式.动态代理.impl;


import 代理模式.动态代理.EmployeeService;

/**
 * @author LuGuoZheng
 * @date 2019/5/9 10:31
 * @Version 3.0
 * @description 真实对象
 */
public class EmployeeServiceImpl implements EmployeeService {

    /**
     * 签订合同
     *
     * @param name     姓名
     * @param contract 合同
     */
    @Override
    public void save(String name, String contract) {
        System.out.println("我是真实对象,与" + name + "签订了" + contract);
    }
}
