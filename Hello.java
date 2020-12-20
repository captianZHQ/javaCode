package test;

public class Hello {
    public static void main(String[] args) {
        System.out.println("********20201220第二个代码*********");
        int i = 5;
        System.out.println(i++);                   //i++   先取值再运算
        System.out.println(i);
        System.out.println(++i);                  //++i   先运算再取值

        i = 1;
        int j = ++i + i++ + ++i + ++i + i++;
        System.out.println(j);                           //j：18
        System.out.println(i);                           //i:6

        i = 1;
        boolean b0 = !(i++ == 3) ^ (i++ ==2) && (i++==3);
        System.out.println(b0);
        System.out.println(i);

    }
}
