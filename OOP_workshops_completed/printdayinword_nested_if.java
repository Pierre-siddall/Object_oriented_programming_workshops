public class printdayinword_nested_if{
  public static void main(String[] args){
    int daynumber=1;
    if (daynumber==0){
      System.out.println("Monday");
    }else if(daynumber==1){
      System.out.println("Tuesday");
    }else if(daynumber==2){
      System.out.println("Wednesday");
    }else if(daynumber==3){
      System.out.println("Thursday");
    }else if(daynumber==4){
      System.out.println("Friday");
    }else if(daynumber==5){
      System.out.println("Saturday");
    }else if(daynumber==6){
      System.out.println("Sunday");
    }else if (daynumber>7 || daynumber<0){
      System.out.println("Not a vaild day");
    }
  }
}
