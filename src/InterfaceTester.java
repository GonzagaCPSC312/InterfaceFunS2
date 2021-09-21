import java.util.Arrays;
import java.util.Random;

public class InterfaceTester {
    public static void main(String[] args) {


        System.out.println("Output 1: " + "zags".compareTo("apple"));
        System.out.println("Output 2: " + "zags".compareTo("Zags")); // a: 97 // A: 65
        System.out.println("Output 3: " + "zags".compareTo("zigs"));
        System.out.println("Output 4: " + "zags".compareTo("zags"));
        System.out.println("Output 5: " + "zags".equals("zags"));
        System.out.println("Output 6: " + "zags".equals("Zags"));
        Circle myCircle = new Circle();
        System.out.println("Output 7: " + myCircle.equals(myCircle));
        System.out.println("Output 8: " + new Circle().equals(new Circle()));

        /**
        What does compareTo() return when invoked with a String?
         0 when the invoking object is the same character by character as the arg object
         < 0 when the invoking object < the arg object
         > 0 when the invoking object > the arg object
        When would you use compareTo()?
         ordering 2 objects, sorting objects in a list
        What does equals() return when comparing Strings? VALUE comparison
         a boolean... true when compareTo() returns 0 (the contents of the strings are the same)
         false otherwise
        What does equals() return when comparing Circles? REFERENCE comparison
         Circle inherits equals() from Object, which returns true when two refs refer to the same object
         false otherwise
        In general, what is the purpose of equals()? (tricky)
         == REFERENCE comparison... so to compare two strings based on their content, use equals() not ==
         What happens when you try to run the following line of code (Output 9)? Any ideas for how to fix this so we can compare two Circle objects?
        */
        System.out.println("Output 9: " + myCircle.compareTo(myCircle));

        // Java provides a Comparable interface
        // interface: a set of methods that a class can promise to implement
        // interfaces define a reference type

        Comparable myComparable = myCircle;

        // we can now sort Circles
        Circle[] circles = new Circle[4];
        Random random = new Random();
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i, i, random.nextDouble());
        }
        System.out.println(Arrays.toString(circles));
        Arrays.sort(circles);
        System.out.println(Arrays.toString(circles));

        // we can define our interfaces
        Shape myShape = myCircle;
    }
}
