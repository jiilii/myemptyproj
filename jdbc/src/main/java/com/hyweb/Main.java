package com.hyweb;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by Administrator on 2014/7/25.
 */
public class Main {
    public static void main(String[] args) {
        test2();

    }

    private static void test2(){

        ResourceBundle rb = ResourceBundle.getBundle("res", Locale.getDefault());
        System.out.println(rb.getString("bbb"));

    }

    private static void test1() throws IOException {
        Properties prop = new Properties();

        //file:/D:/workspace/myemptyproj/jdbc/target/classes/com/hyweb/
//        System.out.println(Main.class.getResource("./"));
        //file:/D:/workspace/myemptyproj/jdbc/target/classes/
//        System.out.println(Main.class.getResource("/"));

//        System.out.println(Main.class.getClassLoader().getResource(""));
//        System.out.println(new File("").getAbsolutePath());

        InputStream in;
        in = Main.class.getClassLoader().getResourceAsStream("db.properties");
        prop.load(in);
        System.out.println(prop.getProperty("version"));
    }

}

    class jdbcUtil {
        static {
            System.out.println("jdbcutil is ，，，，");
        }

        public static void unit() {

    }

}

