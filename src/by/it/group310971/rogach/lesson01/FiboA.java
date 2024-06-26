package by.it.group310971.rogach.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить рекурсивный способ вычисления чисел Фибоначчи
 */

public class FiboA {


    private long startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        FiboA fibo = new FiboA();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fibo.calc(n), fibo.time());

        //вычисление чисел фибоначчи медленным методом (рекурсией)
        fibo = new FiboA();
        n = 34;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fibo.slowA(n), fibo.time());
    }

    private long time() {
        long res = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        return res;
    }

    private int calc(int n) {
        //здесь простейший вариант, в котором код совпадает
        //с математическим определением чисел Фибоначчи
        //время O(2^n)

        int num1 = 0, num2 = 1;

        for (int i = 0; i < n; i++) {
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

        return num1;
    }

    //рекурсия
    //здесь нужно реализовать вариант без ограничения на размер числа,
    //в котором код совпадает с математическим определением чисел Фибоначчи
    //время O(2^n)
    public static BigInteger slowA(Integer n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        return slowA(n - 1).add(slowA(n - 2));
    }
}

