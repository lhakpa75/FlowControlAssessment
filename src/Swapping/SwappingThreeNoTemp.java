package Swapping;

public class SwappingThreeNoTemp {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        a = a + b + c;
        c = a - b - c;
        b = a - c - b;
        a = a - c - b;

        System.out.println("Value of A : " + a);
        System.out.println("Value of B : " + b);
        System.out.println("Value of C : " + c);
    }
}