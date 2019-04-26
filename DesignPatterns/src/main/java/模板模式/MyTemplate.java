package 模板模式;

/**
 * @author LuGuoZheng
 * @date 2019/4/25 10:16
 * @Version 3.0
 * @description 模板模式
 */
public class MyTemplate extends Times{
    @Override
    public void doWord(){
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                sum += j;
            }
        }
        
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new MyTemplate().test("doWord");
    }
}