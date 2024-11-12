package TypeCasting;
public class CharToInt {
    public static void main(String[] args) {
        System.out.println("Char To Int(automatically):");

        char myChar = 'A';
        int myInt = myChar;
        System.out.println(myChar);
        System.out.println(myInt);

        System.out.println("Int To Char(manually):");
        
        int myInt2 = 68;
        char myChar2 = (char) myInt2;
        System.out.println(myInt2);
        System.out.println(myChar2);
    }
}
