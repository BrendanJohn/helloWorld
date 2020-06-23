/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld yourname
 *
 *  Prints "Hello, Bob.!" where "Bob" is replaced by the
 *  command-line argument.
 *
 ******************************************************************************/

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, " + args[0] + "!");
    }

}