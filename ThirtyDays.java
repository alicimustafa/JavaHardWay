import java.util.Scanner;

public class ThirtyDays {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int month, days;
    String monthName;

    System.out.print("which month? (1-12)");
    month = keyboard.nextInt();

    switch(month){
      case 1: monthName = "january";
              break;
      case 2: monthName = "February";
              break;
      case 3: monthName = "March";
              break;
      case 4: monthName = "April";
              break;
      case 5: monthName = "May";
              break;
      case 6: monthName = "june";
              break;
      case 7: monthName = "July";
              break;
      case 8: monthName = "August";
              break;
      case 9: monthName = "September";
              break;
      case 10: monthName = "October";
              break;
      case 11: monthName = "November";
              break;
      case 12: monthName = "December";
              break;
      default: monthName = "erroe";
    }
    /*Thirty days hath September
      April, june and November
      All the rest have thirty-one
      Exept the second month alone
    */

    switch(month){
      case 9:
      case 4:
      case 6:
      case 11: days = 30;
               break;
      case  2: days = 28;
               break;
      default: days = 31;
    }

    System.out.println(days + " day hath " + monthName);
  }
}
