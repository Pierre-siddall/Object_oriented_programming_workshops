public class SumAverageInt_while{
  public static void main(String[] args){
    int sum=0 ;
    double average;
    int lowerbound=1;
    int upperbound=100;
    int number=lowerbound;
    while (number<=upperbound){
      sum+=number;
      number++;
    }average=sum/100;
    System.out.println("The sum is: "+sum);
    System.out.println("The average is: "+average);
  }
}
