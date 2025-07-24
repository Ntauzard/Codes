
import java.util.Scanner;
public class testClass extends Member
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter the number of matches won: ");
        int matchesWon = sc.nextInt();
        
        Member theMember = new Member();
        
        theMember.toString();
        String category = theMember.determineCategory();
        char rating = theMember.determineRating();
        
        System.out.println("Category: "+ category);
        System.out.println("Rating: "+ rating);
    }
}
