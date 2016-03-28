package javalang.classlifecycle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzc on 2016/3/23.
 */
public class Client {
    public static void main(String[] args){
//        B b =  new B();
//        B b2 = new B(1);
        //结论：
        //子类在被创建之前会调用父类缺省构造函数
//        C c = new C();
        //结论：
        //类在被创建时先调用父类缺省构造函数，再调用内部被关联的对象的缺省构造函数，最后再调用自己对应的构造函数。
    }
}
