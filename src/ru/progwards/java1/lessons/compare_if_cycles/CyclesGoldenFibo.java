package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        boolean res = false;
        if (number == 0 && digit == 0)
            res = true;
        while (number != 0) {
            if (number %10 == digit) {
                res = true;
                break;
           }
            number /= 10;
        }
        return res;
    }
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
    public static boolean isGoldenTriangle(int a, int b, int c) {
        boolean result = false;
        if (TriangleInfo.isTriangle(a, b, c) && TriangleInfo.isIsoscelesTriangle(a, b, c)) {
            if (a == b) {
                result = (double) a / c > 1.61703 && (double) a / c < 1.61903;
            }
            else if (a == c) {
                result = (double) a / b > 1.61703 && (double) a / b < 1.61903;
            }
            else result = (double) b / a > 1.61703 && (double) b / a < 1.61903;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 14; i++) {
            System.out.print(fiboNumber(i) + ", ");
        }
        System.out.println(fiboNumber(15) + "\n");

        int a = 1;
        int b = 1;
        int c = 1;

        while (a <= 100) {
            while (b <= 100) {
                while (c <= 100) {
                    if (isGoldenTriangle(a, b, c)) {
                        System.out.print("a = " + a + ", ");
                        System.out.print("b = " + b + ", ");
                        System.out.println("c = " + c);
                    }
                    c++;
                }
                b++;
                c = 1;

            }
            a++;
            b = 1;
        }

    }
}
