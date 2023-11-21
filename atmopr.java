import java.util.*;
class atmoperation{
public int deposit(int amt,int balance){
balance=balance+amt;
System.out.println("THE DEPOSIT AMOUNT "+ amt +" SUCESSFUL");
return balance;
}
public int withdraw(int amt,int balance){
balance=balance-amt;
System.out.println("THE WITHDRAWAL AMOUNT "+ amt +" SUCESSFUL");
System.out.println("************PLEASE COLLECT THE CASH ****************");
return balance;
}
public void checkBalance(int balance){
System.out.println("THE BALANCE IS "+balance);
}}
public class userinterface{
public static void main(String args[]){
int balance=1000;
System.out.println("WELCOME TO INTERNATIONAL BANK");
System.out.println("****************************");
for(int i=0;i<5;i++){
System.out.println("1. DEPOSIT \n 2. WITHDRAW \n 3. BALANCE \n\n\n ENTER YOUR CHOICE : ");
Scanner sc= new Scanner(System.in);
int choice=sc.nextInt();
atmoperation obj = new atmoperation();
switch(choice){
case 1: System.out.println("ENTER AMOUNT TO DEPOSIT");
        int amt=sc.nextInt();
        balance=obj.deposit(amt,balance);
        break;
case 2: System.out.println("ENTER AMOUNT TO WITHDRAW");
        int ammt=sc.nextInt();
        if(ammt>balance){
            System.out.println("INSUFFICIENT BALANCE");
        }
        else{
        balance=obj.withdraw(ammt,balance);
        }
        break;
case 3: obj.checkBalance(balance);
        break;
default:System.out.println("INVALID CHOICE");
        break;
}}}
}





