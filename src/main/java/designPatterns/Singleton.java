package designPatterns;

public class Singleton {

    private String data;
    private static volatile Singleton instance;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data){
        Singleton result = instance;
        if(result == null){
            synchronized (Singleton.class){
                result=instance;
                if(result == null)
                    result = instance = new Singleton(data);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance("hi").hashCode());
        System.out.println(Singleton.getInstance("hello").hashCode());
    }
}
