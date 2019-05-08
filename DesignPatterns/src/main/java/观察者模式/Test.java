package 观察者模式;

import 观察者模式.impl.User;
import 观察者模式.impl.WechatServer;

/**
 * @author LuGuoZheng
 * @date 2019/5/8 14:24
 * @Version 3.0
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Observer u1 = new User("张三");
        Observer u2 = new User("李四");
        Observer u3 = new User("王五");

        Observerable wecahtService = new WechatServer();

        // 观察(订阅)公众号
        wecahtService.registerObServer(u1);
        wecahtService.registerObServer(u2);
        wecahtService.registerObServer(u3);
        System.out.println("--------------------------------");

        // 发布消息
        wecahtService.notifyObServer("第一波福利");
        System.out.println("--------------------------------");

        // 取消关注
        wecahtService.removeObServer(u1);
        System.out.println("--------------------------------");

        // 发布消息
        wecahtService.notifyObServer("这是第二波福利");
    }
}
