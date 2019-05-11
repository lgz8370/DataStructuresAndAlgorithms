package 代理模式.静态代理;

/**
 * @author LuGuoZheng
 * @date 2019/5/9 9:42
 * @Version 3.0
 * @description 代理接口
 */
public interface EmployeeService {

    /**
     * 签订合同
     * @param name 姓名
     * @param contract 合同
     */
    void save(String name, String contract);
}
