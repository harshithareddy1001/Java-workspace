public class wrapper_demo {
public static void main(String[] args) {
int a = 10;                // primitive
Integer obj = Integer.valueOf(a);   // wrapper object

System.out.println(obj);
int x = 20;
Integer y = x;  //auto-boxing  , automatic conversion from primitive to wrapper
System.out.println(y);
Integer n = 30;
int m = n;   // unboxing , automatic conversion 
System.out.println(m);
}
}
