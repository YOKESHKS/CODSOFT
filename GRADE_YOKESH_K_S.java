import java.util.Scanner;
class marks{
public static void main(String [] args){
System.out.println("****** GRADE CALCULATOR *****");
System.out.println("ENTER STUDENT NAME :");
String grade;
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
String name= sc.nextLine();      
System.out.println("ENTER TOTAL NUMBER OF SUBJECT :");
int n=sc.nextInt();
int mark=0;
int totmark=0;
for(int i=0;i<n;i++){
System.out.println("ENTER MARK OF SUBJECT  "+(i+1));
mark=sc.nextInt();
if(mark<=100){
totmark=totmark+mark;}
else{
    System.out.println("INVALID MARK...");
    n=i;
    break;
}
}
int avg=totmark/n;
if(avg<=100 && avg>94){
grade="O+ - EXCELLENT";
}
else if(avg<95 && avg>79){
grade="A+  - VERY GOOD";
}
else if(avg<80 && avg>59){
grade="B+ - GOOD";
}
else if(avg<60 && avg>49){
grade="C+ - CAN DO BETTER";
}
else if(avg>40 && avg<50){
grade="p - NOT BAD ";
}
else{
grade="F - FAILED";
}
System.out.println(" STUDENT NAME           :"+name);
System.out.println(" STUDENT TOTAL MARK     :"+totmark);
System.out.println(" MAXIMUM MARK           :"+(n*100));
System.out.println(" STUDENT TOTAL AVG      :"+avg);
System.out.println(" STUDENT OBTAINED GRADE :"+grade);
}}