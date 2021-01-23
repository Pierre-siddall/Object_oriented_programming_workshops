import java.util.Random;
public class primer{
  public static void main(String[] args){
    // create new instance of the random class
    Random rand=new Random();
    int count=0;
    int rand_int=rand.nextInt(101);
    for (float i=1.0f;i<=rand_int;i++){
      if(rand_int%i==0){
        count++;
      } else {
        continue;
      }
    } if(count==2){
      System.out.println("Number is prime");
    }else{
      System.out.println("Number is not prime");
    }
  }
}
