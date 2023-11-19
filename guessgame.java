import java.lang.Math;
import java.util.Scanner;
public class Randomnumbergame{
public static void main(String args[]){
int flag=0;
int limstart,limend,randomnumber,userprompt,attempt=1;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER STARTING LIMIT");
limstart=sc.nextInt();
System.out.println("ENTER ENDING  LIMIT");
limend=sc.nextInt();
randomnumber=(int)(Math.random()*(limstart-limend+1)+limend );//here min value is inclusive while max value is exclusive
while(flag==0){
System.out.println("IT's YOUR TURN,LETS CHECK ACCURITY OF YOUR GUESS. ENTER RANDOM NUMBER FROM "+limstart+"to"+ limend);
userprompt=sc.nextInt();
if(randomnumber==userprompt){
System.out.println("WOW! IT REALLY AWSOME YOU DID IT IN "+ attempt +" ATTEMPT.I UNDERSTAND THAT YOUR GUESS IS CORRECT");
flag=1;
}
else{
if((int)randomnumber-userprompt<=10){
System.out.println("SORRY not corrct but you are very closer");
flag=0;
}
else{
System.out.println("you are too far");
flag=0;
}
attempt=attempt+1;
}
}
}
}