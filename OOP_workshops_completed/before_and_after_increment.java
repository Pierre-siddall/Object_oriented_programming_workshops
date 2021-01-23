public class before_and_after_increment{
  public static void main(String[] args){
    int a=4;
    int b=a++ +7;
    int c=4;
    int d=++c +7;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
