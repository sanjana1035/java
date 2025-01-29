import java.util.Scanner;
class GreaterNum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number:");
int num1 = sc.nextInt();
System.out.println("Enter 2nd number:");
int num2 = sc.nextInt();

if(num1 > num2){
System.out.println("The first number " + num1 + " is bigger.");
}
else if(num2 > num1){
System.out.println("The second number " + num2 + " is bigger.");
}
else{
System.out.println("Both the Numbers are same.");
}
}
}
