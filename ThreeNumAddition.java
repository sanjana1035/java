import java.util.Scanner;
class ThreeNumAddition{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number:");
int a =sc.nextInt();

System.out.println("Enter 2nd number:");
int b =sc.nextInt();

System.out.println("Enter 3rd number:");
int c =sc.nextInt();

int Totalsum = a+b+c;

System.out.println("The Total Sum is: "+Totalsum);
}
}