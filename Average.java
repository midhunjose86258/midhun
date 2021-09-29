import java.util.Scanner;
public class Average{
public static void main(String [] args){
int num1,num2,num3,avg;
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number");
num1=s.nextInt();
System.out.println("Enter the second number");
num2=s.nextInt();
System.out.println("Enter the third number");
num3=s.nextInt();
avg=(num1+num2+num3)/3;
System.out.println("Average is"+avg);

}
}