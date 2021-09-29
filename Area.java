import java.util.Scanner;
public class Area{
int Area(int x,int y){
return x*y;
}
int Area(int a){
return a*a;
}
double Area(double b,double h){
double m=b/2;
return h*m;
}
double Area(double r){
return 3.14*r*r;
}
public static void main(String []args){
Area obj=new Area();
System.out.println("Rectangle area is:"+obj.Area(5,4));
System.out.println("Circle area is:"+obj.Area(4));
System.out.println("triangle area is:"+obj.Area(5.1,4.2));
System.out.println("Circle area is:"+obj.Area(4.2));
}
}