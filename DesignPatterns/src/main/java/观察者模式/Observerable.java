package 观察者模式;

/**
 * @author LuGuoZheng
 * @date 2019/5/8 13:42
 * @Version 3.0
 * @description 被观察者接口
 */
public interface Observerable {

    /**
     * 注册观察者
     *
     * @param observer 观察者
     */
    void registerObServer(Observer observer);

    /**
     * 移除观察
     *
     * @param observer 观察者
     */
    void removeObServer(Observer observer);

    /**
     * 通知观察者
     * @param message 消息
     */
    void notifyObServer(String message);
}
