public class Methodoverloading{
public static void customer(int phonenumber){
System.out.println("phonenumber is"+phonenumber);
}
public static void customer(int phonenumber,int aadharnumber){
System.out.println("argument"+phonenumber+"and"+aadharnumber);

}
public static void Customer(int a,int b){
int c=a+b;
//return c;
System.out.println("add:"+(a+b));
}
}

