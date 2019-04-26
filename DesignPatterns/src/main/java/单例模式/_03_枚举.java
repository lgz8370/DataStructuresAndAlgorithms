package 单例模式;

/**
 * @author LuGuoZheng
 * @date 2019/4/23 12:00
 * @Version 3.0
 * @description
 */
public enum _03_枚举 {

    INSTANCE;

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        _03_枚举.INSTANCE.setName("lgz");
        System.out.println(_03_枚举.INSTANCE.getName());
    }
}
