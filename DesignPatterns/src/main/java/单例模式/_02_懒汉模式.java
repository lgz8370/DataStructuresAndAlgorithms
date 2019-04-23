package 单例模式;

import lombok.Data;

/**
 * @author LuGuoZheng
 * @date 2019/4/23 11:38
 * @Version 3.0
 * @description
 *
 */
@Data
public class _02_懒汉模式 {

    private Integer id;

    private String namge;

    private Integer age;

    private volatile static _02_懒汉模式 INSTANCE;

    // 私有化构造器
    private _02_懒汉模式(){}


    // 提供公共静态方法获取实例
    public static _02_懒汉模式 getInstance(){
        if (INSTANCE == null){
            synchronized (_02_懒汉模式.class){
                if (INSTANCE == null){
                    INSTANCE = new _02_懒汉模式();
                }
            }
        }
        return INSTANCE;
    }
}
