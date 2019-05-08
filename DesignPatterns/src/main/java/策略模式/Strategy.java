package 策略模式;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuGuoZheng
 * @date 2019/4/26 14:36
 * @Version 3.0
 * @description 策略模式
 */
public class Strategy {

    /**
     * 过滤数据方法
     * @param nums 数据源
     * @param condition 策略
     * @return
     */
    public List<Integer> filteNum(List<Integer> nums,Condition condition){
        List<Integer> newNums = new ArrayList<>();
        for (Integer num : nums) {
            if (condition.check(num)){
                newNums.add(num);
            }
        }
        return newNums;
    }

    @Test
    public void test() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        list = filteNum(list, new Condition() {
            @Override
            public boolean check(int num) {
                return num % 2 == 0;
            }
        });
        System.out.println(list); // [2, 4, 6]

        list = filteNum(list, new Condition() {
            @Override
            public boolean check(int num) {
                return num < 5;
            }
        });
        System.out.println(list); // [2, 4]
    }

}
