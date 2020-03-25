package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    public static class CacheInfo {
        public int n;
        public int fibo;

        public CacheInfo(int n, int fibo) {
            this.n = n;
            this.fibo = fibo;
        }
    }
    private static CacheInfo lastFibo;
    public static int fiboNumber(int n) {
        int num = 1;
        int rnum = 0;
        int i = n;
        if (lastFibo != null && lastFibo.n == n)
            num = lastFibo.fibo;
        else {
            while (i > 2) {
                i--;
                rnum = num - rnum;
                num = num + rnum;
            }
            lastFibo = new CacheInfo(n, num);
        }
        return num;
    }
    public static CacheInfo getLastFibo() {
        return lastFibo;
    }
    public static void clearLastFibo() {
        lastFibo = null;
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(3));
        System.out.println(lastFibo.n);
        System.out.println(lastFibo.fibo);
        System.out.println(getLastFibo().n);
        System.out.println(getLastFibo().fibo);
    }
}
