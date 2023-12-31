/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stdin.stdout.i;

import java.util.*;

public class App {

    private String inputString;
    private int inputInteger;
    

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputInteger(int inputInteger) {
        this.inputInteger = inputInteger;
    }

    public int getInputInteger() {
        return inputInteger;
    }

    public static void main(String[] args) {
        App app = new App();
        Scanner scan = new Scanner(System.in);
        String inputString = scan.next();
        app.setInputString(inputString);
        int inputInteger = scan.nextInt();
        app.setInputInteger(inputInteger);
        scan.close();
        System.out.println("The input string is: " + app.getInputString());
        System.out.println("The input integer is: " + app.getInputInteger());
    }
}
