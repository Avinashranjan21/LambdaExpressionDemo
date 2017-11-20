package com.devschool;


public class Main {

    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10)) System.out.println("10 is even");
        if (!isEven.test(9)) System.out.println("9 is not even");

        NumericTest isVeg = (n) -> n == 1;

        if (isVeg.test(1)) {
            System.out.println("He is veg");
        }

        testMethod(new TestClass() {
            @Override
            public void m1() {
                System.out.println("OKAHHH");
            }

            @Override
            public void m2(int n) {
                System.out.println(n + " ~ OKAHHAAA");
            }
        });


    }

    public static void testMethod(TestClass tc) {
        System.out.println("testMethod");
    }
}
