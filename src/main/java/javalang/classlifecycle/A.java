package javalang.classlifecycle;

/**
 * Created by lzc on 2016/3/23.
 */
public class A {
    public A(){
        System.out.println("A is built");
    }

    public A(int a) {
        System.out.println("A param a is built");
    }
}
