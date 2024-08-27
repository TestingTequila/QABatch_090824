package variables;

import java.beans.JavaBean;

public class StringConcatenation {
    public static void main(String[] args) {
        String name = "Ashish";
        System.out.println(name);
        String remark = "I love Java";
        System.out.println(remark);

        String s1 = "1";
        String s2 = "2";

        System.out.println(s1 + s2);

        //STRING CONCATENATION

        String x = "hello";
        String y = "world";

        int a= 100;
        int b =200;

        System.out.println(x+y);// helloworld
        System.out.println(a+b);// 300
        System.out.println(x+a);//hello100
        System.out.println(a+b+x);//300hello
        System.out.println(x+a+b);//hello100200
        System.out.println(x+a+y+b);//hello100world200
        System.out.println(a+b+x+y+a+b);//300helloworld100200

        System.out.println(a+x+b+y+a+b);//100Hello200world100200
    }


}
