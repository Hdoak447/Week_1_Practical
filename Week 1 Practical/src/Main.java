import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Question1();
        //Question2();
        //Question3();
        //Question4();
        //Question5();
        Question6();
    }

    public static void Question1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter First Initial: ");
        Character initial = scanner.next().charAt(0);
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter Salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter employment status: ");
        boolean isEmployed = scanner.nextBoolean();
        if(isEmployed == true){
            System.out.println(initial + " " + surname + " is " + age + " years old, is currently employed and has a salary of " + salary + " per year.");
        }
        else{
            System.out.println(initial + " " + surname + " is " + age + " years old, is currently unemployed.");
        }

    }

    public static void Question2(){
        Scanner scanner = new Scanner(System.in);
        //int a = 10;
        //int b = 5;
        //System.out.println("Sum: " + sum + " \nDifference: " + difference + " \nProduct: " + product + " \nQuotient: " +quotient);
        System.out.println("Enter value 1: ");
        int a = scanner.nextInt();
        System.out.println("Enter value 2: ");
        int b = scanner.nextInt();
        int sum = a +b;
        int difference = a-b;
        int product = (a*b);
        double quotient = (a/b);
        System.out.println("1 - Sum \n2 - Difference \n3 - Product \n4 - Quotient" + " \nChoose Arithmetic: ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Sum is " + sum);
                break;
            case 2:
                System.out.println("Difference is " + difference);
                break;
            case 3:
                System.out.println("Product is " + product);
                break;
            case 4:
                System.out.println("Quotient is " + quotient);
                break;
        }
    }

    public static void Question3(){
        Scanner scanner = new Scanner(System.in);
        char choice = 'Y';
        while(choice == 'Y'){
            System.out.println("Enter value: ");
            int value = scanner.nextInt();
            if(value %2 == 0){
                System.out.println("Value is Even.");
            }
            else{
                System.out.println("Value is Odd.");
            }
            System.out.println("Continue, Y/N?: ");
            choice = scanner.next().charAt(0);
        }
    }

    public static void Question4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many movies: ");
        int choice = scanner.nextInt();
        String[] movies = new String[choice+1];
        System.out.println("Enter Movie Names: ");
        for(int i=0; i< choice+1; i++){
            movies[i] = scanner.nextLine();
        }
        for(int i = 0; i< movies.length; i++){
            System.out.print(movies[i] + " ");
        }
    }

    public static void Question5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for A: ");
        int a = scanner.nextInt();
        System.out.println("Enter a value for B: ");
        int b = scanner.nextInt();
        Sum(a,b);
        Difference(a,b);
        Product(a,b);
        Quotient(a,b);
    }

    public static void Sum(int a , int b){
        System.out.println("Sum: " + (a+b));
    }
    public static void Difference(int a , int b){
        System.out.println("Difference: " + (a-b));
    }
    public static void Product(int a , int b){
        System.out.println("Product: " + (a*b));
    }
    public static void Quotient(int a , int b){
        System.out.println("Quotient: " + (a/b));
    }

    public static void Question6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        for(int i=0; i<name.length(); i++)
        {
            char character = name.charAt(i);
            String reverseString = character + reverseString;
        }
        System.out.println("Reverse: " + reverseString);

    }
}