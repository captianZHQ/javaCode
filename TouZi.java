package test;

public class TouZi {
    // f最终收入，p本金，r年利率，n存了多少年
    public static void main(String[] args) {
        System.out.println("************20201221**********");
        int n = 1;
        int p = 10000;
        final double r = 0.05;
        double f = 1;
        double F = 0;

        for (int i = 0; i < n; i++) {
            f *= (1 + r);
        }
        F = f * p;
        System.out.println(n + "年的复利收入为：" + F);
    }
}
