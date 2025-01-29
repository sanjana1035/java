import java.util.Scanner;
class NumRelation{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number:");
int a = sc.nextInt();
System.out.println("Enter 2nd number:");
int b = sc.nextInt();
System.out.println("\nComparison Results:");
System.out.println(a + " < " + b + " is " + (a < b));
System.out.println(a + " <= " + b + " is " + (a <= b));
System.out.println(a + " > " + b + " is " + (a > b));
System.out.println(a + " >= " + b + " is " + (a >= b));
System.out.println(a + " == " + b + " is " + (a == b));
System.out.println(a + " != " + b + " is " + (a != b));
}
}