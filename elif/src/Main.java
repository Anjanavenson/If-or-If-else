import java.util.Scanner;
import java.lang.String;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        int Age;
        System.out.println("Enter you Age:");
        Scanner sc = new Scanner(System.in);
        Age = sc.nextInt();
        if(Age == 18){
            System.out.println("Eligible for voting");
        }else if(Age >= 18){
            System.out.println("Eligible for voting");
        }else
            System.out.println("Not Eligible for Voting");
    }
}