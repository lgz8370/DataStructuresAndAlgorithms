package 观察者模式;

/**
 * @author LuGuoZheng
 * @date 2019/5/8 13:44
 * @Version 3.0
 * @description
 */
public interface Observer {

    /**
     * 当被观察者发布消息时,调用观察者的update方法,更新消息
     *
     * @param message 消息
     */
    void update(String message);

}
