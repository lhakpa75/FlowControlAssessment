package Swapping;

public class SwappingTwo {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of A : " + a);
        System.out.println("Value of B : " + b);
    }
}