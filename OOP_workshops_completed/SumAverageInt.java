public class SumAverageInt{
  public static void main(String[] args){
    int sum=0;
    double average;
    int lower=1;
    int upper=100;
    for (int number=lower; number<=upper; ++number){
      sum+=number;
    } average=sum/100;
    System.out.println(sum);
    System.out.println(average);
  }
}
