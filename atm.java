import java.util.*;
class atm{
    public static void main(String args[]){
        int flag=0,i,val=0;
        System.out.println("WELCOME TO YOKESH INTERNATIONAL BANK, YOU ARE OUR FIRST PRIORITY");
        System.out.println("*************************************************");
        /*ACCOUNT NUMBER      PIN
            120           -   1111
            121           -   2222
            122           -   3333
            123           -   4444  */
        ArrayList<Integer> arr = new ArrayList<Integer>();// contain acc numbers
        arr.add(120);
        arr.add(121);
        arr.add(122);
        arr.add(123);
        ArrayList<Integer> pswd = new ArrayList<Integer>();// contain pin
        pswd.add(1111);
        pswd.add(2222);
        pswd.add(3333);
        pswd.add(4444);
        ArrayList<Integer> blc = new ArrayList<Integer>();//to store balance
        ArrayList<String> his = new ArrayList<String>();// to store history
        for(i=0;i<4;i++)
        blc.add(0);
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE ACCOUNT NUMBER");
        int accno=sc.nextInt();
        for(i=0;i<4;i++){
            if(accno==arr.get(i)){
            val=i;
            flag=1;}
        }
        System.out.println("ENTER THE PIN");
        int pin=sc.nextInt();
        if(pin!=pswd.get(val)){
        System.out.println("PIN DOESNOT MATCH");
        System.exit(0);}
        else{
        for(i=0;i<5;i++){
        System.out.println("ENTER CHOICE");
        System.out.println("1.deposit \n 2.withdraw \n 3.history \n 4.Balance   \n 5.QUIT");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("ENTER AMOUNT TO DEPOSIT");
                int amt=sc.nextInt();
                blc.set(val,blc.get(val)+amt);
                his.add("DEPOSIT AMOUNT "+amt+"to"+accno);
                System.out.println("THE BALANCE IS " + blc.get(val));
                break;
            case 2:
                System.out.println("ENTER AMOUNT TO WITHDRAW");
                int ammmt=sc.nextInt();
                if(blc.get(val)>ammmt){
                System.out.println("PLEASE COLLECT CASH");
                int ammt=blc.get(val)-ammmt;
                blc.set(val,ammt);
                his.add("withdraw AMOUNT "+ammmt+"from"+accno);}
                else
                System.out.println("INSUFFICIENT BALANCE");
                System.out.println("THE BALANCE IS " +blc.get(val));
                break;
            case 3:
                System.out.println("**TRANSACTION HISTORY***");
                System.out.println("\n");
                his.forEach((n) ->System.out.println(n));
                break;
            case 4:
                System.out.println("THE BALANCE IS " +blc.get(val));
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("INVALID CHOICE");
}}}
}
}