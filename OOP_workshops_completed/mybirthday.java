public class mybirthday{
  public static void main(String[] args){
    int currentDate=14;
    int currentDay=1;
    final int DAYS_A_WEEK=7;
    int myBirthdayDate=30;
    int myBirthdayDay=(myBirthdayDate-currentDate)%DAYS_A_WEEK+currentDay;
    myBirthdayDay=myBirthdayDay%DAYS_A_WEEK;
    System.out.println(myBirthdayDay);
  }
}
