import java.util.Scanner;

public class CalculatesAges {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter current year");
        Integer current_year = sc.nextInt();
        System.out.println("Please enter your age");
        Integer age = sc.nextInt();
        System.out.println("You were born in " + (current_year - age));
        
       System.out.println("Please enter the age of 1st person");
        Integer age1 = sc.nextInt();
        System.out.println("1st person was born in " + (current_year - age1));
        System.out.println("1st person in 1960 was:  " + (1960 - (current_year-age1)));
        System.out.println("1st person in 2040 will be:  " + (2040 - (current_year - age1)));
        
        System.out.println("Please enter the age of 2nd person");
        Integer age2 = sc.nextInt();
        System.out.println("2nd person was born in " + (current_year - age2));
        System.out.println("2nd person in 1960 was:  " + (1960 - (current_year-age2)));
        System.out.println("2nd person in 2040 will be:  " + (2040 - (current_year - age2)));
        
        System.out.println("Please enter the age of 3rd person");
        Integer age3 = sc.nextInt();
        System.out.println("3rd person was born in " + (current_year - age3));
        System.out.println("3rd person in 1960 was:  " + (1960 -(current_year-age3)));
        System.out.println("3rd person in 2040 will be:  " + (2040 - (current_year - age3)));
        
    }
    
}