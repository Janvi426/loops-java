import java.util.*;
public class loop {
     public static void main(String...arg){
        Scanner sc = new Scanner(System.in);
        
        // print 1 to n numbers using while
        System.out.print("Enter how many numbers do you want to print : ");
        int N = sc.nextInt();
        int num = 1;
        while(num<=N){
            System.out.print(num + " ");
            num++;
        }
        
        
        // sum of n numbers using while 
        System.out.print("Enter n to to calculate sum of 1 to n number : ");  
        int n = sc.nextInt();
        int Num = 1;
        int sum = 0;
        while(Num <= n){
            sum += Num;
            Num++;
        }
        System.out.println("Sum of " + n + " numbers is = " + sum);

        
        // square pattern using for loop 
        for(int line=1; line<=4; line++){
            System.out.println("****");
        }
        
        // inverse a number by printing last digit using while loop
        System.out.print("Enter number to reverse : ");
        int number  = sc.nextInt();
        int lastDigit=0;
        System.out.print("Reversed number is : " );
        while(number > 0){
            lastDigit = number % 10;
            number /= 10;
            System.out.print(lastDigit);
        }
     
        
        // inverse a number by replacing place of number using while loop
        System.out.print("Enter number to reverse : ");
        int num  = sc.nextInt();
        int rev = 0;
        int lastdigit=0;
        System.out.print("Reversed number is : " );
        while(num > 0){
            lastdigit = num % 10;
            rev = (rev * 10 ) + lastdigit; 
            num /= 10;
        }    
        System.out.println(rev);
        
        
        // keep entering numbers till user enters number multiple of 10 ( break )
        do{
            System.out.print("Enter any number : ");
            int numbers = sc.nextInt();
               if(numbers % 10 == 0){
                   break;
               }
            System.out.println(numbers);
        }while(true);
        
        
        // display all numbers entered by used except multiple of 10 ( continue )
        do{
            System.out.print("Enter any number : ");
            int numbers = sc.nextInt();
            if(numbers % 10 == 0){
                           continue;
                       }
            System.out.println(numbers);
            }while(true);
    
        
        // check the number wether it is prime or not
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            boolean isprime = true;
            if(n == 2){
                System.out.println("2 is a prime number");
            } else {
            for(int i=2; i<=Math.sqrt(n); i++){  //also we car write as i<=n-1 ( take more time to exicute)
                if(n % i == 0){  // n is multiple of i ( i is not =  1 and n)
                   isprime = false;
                }
            }    
            if(isprime == true){
                System.out.println(n + " is a prime number");
            } else{
                System.out.println(n + " is not a prime number");
            }
          }
    
        
        // user will enter set of numbers and we want to dispalay sum of even numbers and sum of odd numbers
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do{
            System.out.print("Enter any number :  ");
            number = sc.nextInt();
            if(number % 2 == 0){
                evenSum = evenSum + number;
            } else {
                oddSum = oddSum + number;
            }
            System.out.println("Do you want to continue...press 1 for yes and 0 for no");
            choice = sc.nextInt();
        } while(choice == 1);
        System.out.println("sum of even numbers = " + evenSum);
        System.out.println("sum of odd numbers = " + oddSum);
        
        
        // find factorial of any number 
        System.out.print("Enter number to find its factorial = ");
        int number = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=number; i++ ){
            fact = fact * i;
        }
        System.out.println("Factorial is : " + fact);
    
        //  multiplication table of number n entered by user
        System.out.print("Enter a number to find its multiplication table : ");
        int n = sc.nextInt();
        int mul = 1;
        for(int i=1; i<=10; i++){
            mul = n * i;
            System.out.println(n + " * " + i + " = " + mul );
        }
}
}
