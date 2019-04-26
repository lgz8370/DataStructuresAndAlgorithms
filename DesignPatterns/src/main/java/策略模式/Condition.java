package 策略模式;

/**
 * @author LuGuoZheng
 * @date 2019/4/26 14:37
 * @Version 3.0
 * @description
 */
public interface Condition {

    /**
     * 条件
     * @param num 数据
     * @return
     */
    boolean check(int num);
}
