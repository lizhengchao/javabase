package javalang.classlifecycle;

/**
 * Created by lzc on 2016/3/23.
 */
public class B extends A{
    public B(){
        System.out.println("B is built");
    }

    public  B(int b){
        System.out.println("B param b is built");
    }

}
