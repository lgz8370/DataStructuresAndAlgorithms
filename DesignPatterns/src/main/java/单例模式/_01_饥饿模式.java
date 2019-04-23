package 单例模式;

import lombok.Data;

/**
 * @author LuGuoZheng
 * @date 2019/4/23 11:15
 * @Version 3.0
 * @description
 *
 * 优点: 直接在类加载时就初始化一个实例,可以避免线程安全问题
 * 缺点: 由于是类加载时就初始化了一个实例,如果一直没有使用该实例,会造成内存浪费,而且没能起到懒加载效果
 */
@Data
public class _01_饥饿模式 {

    private Integer id;

    private String name;

    private Integer age;

    // 私有化构造器
    private _01_饥饿模式(){}

    // 初始化一个实例
    private static final _01_饥饿模式 INSTANCE = new _01_饥饿模式();

    // 提供公共静态方法获取实例
    public static _01_饥饿模式 getInstance(){
        return INSTANCE;
    }
}
