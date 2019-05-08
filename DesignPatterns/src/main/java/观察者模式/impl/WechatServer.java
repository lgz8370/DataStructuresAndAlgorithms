package 观察者模式.impl;

import 观察者模式.Observer;
import 观察者模式.Observerable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuGuoZheng
 * @date 2019/5/8 13:51
 * @Version 3.0
 * @description 公众号
 */
public class WechatServer implements Observerable {

    /**
     * 寄存订阅了该公众号的用户(观察者)
     */
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 注册观察者
     *
     * @param observer 观察者
     */
    @Override
    public void registerObServer(Observer observer) {
        observerList.add(observer);
        System.out.println("[" + ((User) observer).getName() + "]" + "关注了公众号~!");
    }

    /**
     * 取消观察
     *
     * @param observer 观察者
     */
    @Override
    public void removeObServer(Observer observer) {
        if (observer == null) {
            return;
        }
        boolean remove = observerList.remove(observer);
        if (remove) {
            System.out.println("[" + ((User) observer).getName() + "]" + "取消了关注~! (╯‵□′)╯︵┻━┻");
        }
    }

    /**
     * 通知观察者
     *
     * @param message 消息
     */
    @Override
    public void notifyObServer(String message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
