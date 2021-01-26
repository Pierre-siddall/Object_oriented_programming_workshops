import java.util.Scanner;
public class NumberPattern{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size=input.nextInt();
    input.close();
    for (int row=1; row<=size; row++){
      for (int col=1; col<=size; col++){
        if (row>=col){
          System.out.print(col+" ");
        }
      } System.out.print("\r\n");
    }
  }
}
