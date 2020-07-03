import java.util.Scanner;

public class CalculateAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter current year");
        Integer current_year = sc.nextInt();
        System.out.println("Please enter your age");
        Integer age = sc.nextInt();
        System.out.println("You were born in " + (current_year - age));
        
        
        for(int i=1;i<=3;i++){
        System.out.println("Please enter the age of " + (i) + " person");
        Integer age1 = sc.nextInt();
        System.out.println((i)+" person was born in " + (current_year - age1)); 
        if((current_year-age1) > 1960){
            System.out.println("Age doesnt exist");
        }
        else{
        System.out.println((i)+" person in 1960 was:  " + (1960 - (current_year-age1)));}
        
        System.out.println((i)+" person in 2040 will be:  " + (2040 - (current_year - age1)));
        
    }
    
}}
