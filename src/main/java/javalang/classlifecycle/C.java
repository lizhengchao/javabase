package javalang.classlifecycle;

/**
 * Created by lzc on 2016/3/23.
 */
public class C extends D{
    public A a = new A();
    public C(){
        System.out.println("C is built");
    }
}
