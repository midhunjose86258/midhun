import java.util.Scanner;
public class Electricity_bill
{
int con_no,phone,unit;
double bill;
String name;
Scanner s=new Scanner(System.in);
void get()
{
System.out.println("Enter the consumer name");
name=s.nextLine();
System.out.println("Enter the consumer number");
con_no=s.nextInt();
System.out.println("Enter phone number");
phone=s.nextInt();
System.out.println("Enter the consumer unit tariff");
unit=s.nextInt();
}
double cal()
{
if(unit>100 && unit<200)
 {
  bill=unit*1.2;
 }
else if(unit>200 && unit<300)
 {
  bill=unit*2;
 }
else
{
bill=unit*3;
}
return bill;
}
public static void main(String []args)
{
double p;
Electricity_bill obj=new Electricity_bill();
obj.get();
p=obj.cal();
System.out.println("Bill is:"+p);
}
}