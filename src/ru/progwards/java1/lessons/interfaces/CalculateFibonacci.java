package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    public static class CacheInfo {
        public int n;
        public int fibo;
    }
    private static CacheInfo lastFibo;
    public static int fiboNumber(int n) {
        int num = 1;
        int rnum = 0;
        while (n > 2) {
            n--;
            rnum = num - rnum;
            num = num + rnum;
        }
        return num;
    }
    public static CacheInfo getLastFibo() {
        return lastFibo;
    }
    public static void clearLastFibo() {
        lastFibo = null;
    }
}
