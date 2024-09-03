package Swapping;

public class SwappingFourNoTemp {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 6;

        a = a + b + c + d;
        d = a - b - c - d;
        c = a - b - d - c;
        b = a - b - d - c;
        a = a - b - d - c;

        System.out.println("Value of A : " + a);
        System.out.println("Value of B : " + b);
        System.out.println("Value of C : " + c);
        System.out.println("Value of D : " + d);
    }
}
