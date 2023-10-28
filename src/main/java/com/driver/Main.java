package com.driver;

public class Main {
    public static class Product
    {
        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product P = new Product();
        P.product(10,20);
        P.product(10,20,30);
        P.product(10.0 ,20.0);
    }
}