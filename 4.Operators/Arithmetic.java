public class Arithmetic {
    public static void main(String[] args) {
        // Addition(+) operator
        System.out.println("Addition(+) operator:");
        int sum1 = 30;
        int sum2 = 250;
        int valo1 = sum1 + sum2;
        System.out.println(valo1);

        // Subtraction(-) operetor
        System.out.println(" Subtraction(-) operetor:");
        int valo2 = sum2 - sum1;
        System.out.println(valo2);

        // Multiplication(*) operetor
        System.out.println("Multiplication(*) operetor:");
        int valo3 = sum1 * sum2;
        System.out.println(valo3);

        // Division(/) operetor
        System.out.println("Division(/) operetor:");
        float valo4 = sum2 / sum1;
        System.out.println(valo4);

        // Modulus(%) operetor
        System.out.println("Modulus(%) operetor:");
        float valo5 = sum2 % sum1;
        System.out.println(valo5);

        // Increment(++) operetor
        System.out.println("Increment(++) operetor:");
        int valo6 = ++sum1;
        System.out.println("Pree increment:" + valo6);

        int valo7 = sum2++;
        System.out.println("Post increment:" + valo7);

        // Decrement(--) operetor
        System.out.println("Decrement(--) operetor:");
        int valo8 = --sum1;
        System.out.println("Pree Decrement:" + valo8);

        int valo9 = sum2--;
        System.out.println("Post Decrement:" + valo9);

    }
}
