package jdbc;


import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by lzc on 2016/3/28.
 */
public class Connect {
    public static void main(String[] args){
        try{
            //加载MySql的驱动类
            //主要是调用了Driver类中的static部分的代码
            Class.forName("com.mysql.jdbc.Driver") ;
        }catch(ClassNotFoundException e){
            System.out.println("找不到驱动程序类 ，加载驱动失败！");
            e.printStackTrace() ;
        }
        //建立连接
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "";
        com.mysql.jdbc.Connection connection = null;
        try {
            connection = (com.mysql.jdbc.Connection)DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            System.out.println("数据库连接失败");
            e.printStackTrace();
        }
        //创建Statement
        Statement statement = null;
        try {
            statement = (Statement)connection.createStatement();
        } catch (SQLException e) {
            System.out.println("创建Statement失败");
            e.printStackTrace();
        }
        //执行语句
        try {
            statement.executeUpdate("create TABLE  student(id INT PRIMARY  KEY , name varchar(50), sex int)");
        } catch (SQLException e) {
            System.out.println("执行sql语句失败");
            e.printStackTrace();
        }

    }
}
