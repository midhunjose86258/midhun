import java.util.Scanner;
public class Discount{
int market_price,final_amount,discount;
String product;
Scanner s=new Scanner(System.in);
void get()
{
System.out.println("Enter the product name");
product=s.nextLine();
System.out.println("Enter the market price");
market_price=s.nextInt();
System.out.println("Enter the discount %");
discount=s.nextInt();
}
int cal()
{
final_amount=market_price-((market_price*discount)/100);
return final_amount;
}
public static void main(String []args)
{
int w;
Discount obj=new Discount();
obj.get();
w=obj.cal();
System.out.println("Final Amount is:"+w);
}
}
