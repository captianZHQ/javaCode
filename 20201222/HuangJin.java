package test;

public class HuangJin {
    public static void main(String[] args) {
        float min = 1f, temp, i, j;
        float a = 1f, b = 1f;
        for (i = 1; i < 21; i++) {
            for (j = 1; j < 21; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                    continue;
                temp = Math.abs(i / j - 0.618f);
                if (temp < min) {
                    min = temp;
                    a = i;
                    b = j;
//                    System.out.println(min);
                }
            }
        }
        System.out.println(a + "\n" + b + "\n" + a / b);

    }
}
