import java.util.Scanner;
public class Matrix_mul{
int[][] first=new int[10][10];
int[][] second=new int[10][10];
int[][] product=new int[10][10];
int sum=0,i,j,k,fr,fc,sr,sc;
Scanner s=new Scanner(System.in);
void get(){
System.out.println("Enter the rows and columns of first matrix");
fr=s.nextInt();
fc=s.nextInt();
System.out.println("Enter the elements of first matrix");
for(i=0;i<fr;i++){
for(j=0;j<fc;j++){
first[i][j]=s.nextInt();
}
}
System.out.println("Enter the rows and columns of second matrix");
sr=s.nextInt();
sc=s.nextInt();
System.out.println("Enter the elements of second matrix");
for(i=0;i<sr;i++){
for(j=0;j<sc;j++){
second[i][j]=s.nextInt();
}
}
if(fc!=sr){
System.out.println("Multiplication is not possible");
}
else{
for(i=0;i<fr;i++){
 for(j=0;j<sc;j++){
  for(k=0;k<sr;k++){
  sum+=first[i][k]*second[k][j];
   }
  product[i][j]=sum;
  sum=0;
}}}
}
void display()
{
System.out.println("The product is");
for(i=0;i<fr;i++){
for(j=0;j<sc;j++){
System.out.print(product[i][j]+" ");
}
System.out.println();
}}
public static void main(String[] args){
Matrix_mul obj=new Matrix_mul();
obj.get();
obj.display();
}}