package 观察者模式.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import 观察者模式.Observer;

/**
 * @author LuGuoZheng
 * @date 2019/5/8 13:56
 * @Version 3.0
 * @description 观察者
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Observer {

    private String name;

    /**
     * 当被观察者发布消息时,调用观察者的update方法,更新消息
     *
     * @param message 消息
     */
    @Override
    public void update(String message) {
        System.out.println("我是:" + name + "," + message);
    }

}
