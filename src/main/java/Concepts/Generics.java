package Concepts;


class MyGenerics<T1, T2>{
    private int val;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    @Override
    public String toString() {
        return "MyGenerics{" +
                "val=" + val +
                ", t1=" + t1 +
                ", t2=" + t2 +
                '}';
    }
}
public class Generics {
    public static void main(String[] args) {

        MyGenerics<String, Integer> myGenerics1= new MyGenerics<>(1,"Neethu",10);
        MyGenerics<Integer,String> myGenerics2 = new MyGenerics<>(2,11,"Roy");
        System.out.println(myGenerics1);
        System.out.println(myGenerics2);

    }
}
