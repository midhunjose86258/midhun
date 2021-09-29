import java.sql.SQLOutput;
import java.util.Scanner;
public class Bank_application{
    public static void main(String [] args){
        Bank_account obj=new Bank_account("xyz", "00");
        obj.showdetails();

    }

}
class Bank_account{
    int balance;
    int previous_tran;
    String customer_name;
    String customer_id;
    Bank_account(String cname,String cid)
    {
        customer_name=cname;
        customer_id=cid;
    }
    void deposit(int amount)
    {
        if(amount!=0)
        {
            balance=balance+amount;
            previous_tran=amount;
        }
    }
    void with_draw(int amount)
    {
        if(amount!=0)
        {
            balance=balance-amount;
            previous_tran=-amount;
        }
    }
    void getprev_transaction()
    {
        if(previous_tran > 0)
        {
            System.out.println("Deposit :"+previous_tran);
        }
        else if(previous_tran < 0)
        {
            System.out.println("Withdraw :"+Math.abs(previous_tran));
        }
        else
        {
            System.out.println("No Transactions");
        }
    }
    void showdetails()
    {
        char option;
        Scanner s=new Scanner(System.in);
        System.out.println("**WELCOME**"+customer_name);
        System.out.println("YOUR ID"+customer_id);
        System.out.println("------------------------------------------------------------");
        System.out.println("A :BALANCE");
        System.out.println("B :DEPOSIT");
        System.out.println("C :WITHDRAW");
        System.out.println("D :PREVIOUS TRANSACTION");
        System.out.println("E :EXIT");
        do
        {
            System.out.println("===========================================================");
            System.out.println("Enter Option");
            System.out.println("============================================================");
            option=s.next().charAt(0);

            switch(option)
            {
                case 'A':
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Balance :"+balance);
                    System.out.println("------------------------------------------------------");
                    break;
                case 'B':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Enter the amount to deposit");
                    System.out.println("-------------------------------------------------------");
                    int amount=s.nextInt();
                    deposit(amount);
                    break;
                case 'C':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Enter the amount to withdraw");
                    System.out.println("-------------------------------------------------------");
                    int amount2=s.nextInt();
                    with_draw(amount2);
                case 'D':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Previous transaction is");
                    getprev_transaction();
                    System.out.println("-------------------------------------------------------");
                    break;
                case 'E':
                    System.out.println("********************************************************");
                    break;
                default:
                    System.out.println("INVALID!!TRY AGAIN");
                    break;


            }

        }while(option !='E');
    }
}

