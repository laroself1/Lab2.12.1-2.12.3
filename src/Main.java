/**
 * Created by LaroSelf on 02.04.2016.
 *//*
       *  Labs   2.12.1 - 2.12.2
    public class Main {
    public enum MyDayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY   }

    public static void main(String[] args) {
        for (MyDayOfWeek str: MyDayOfWeek.values()  ) {
            switch (str) {
                case MONDAY:
                    System.out.println("My Java day 1 Mon");
                 break;
                case WEDNESDAY:
                    System.out.println("My Java day 2 Wed");
                    break;
                case FRIDAY:
                    System.out.println("My Java day 3 Fri");
                     break;
           }  }  }  }
*/


//   2.12.3
    import java.util.Scanner;
public class Main {
    public enum MyDayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;


        public String nextDayOfWeek() {

            int currentDayNumber = this.ordinal();
            if (currentDayNumber <= 5) {
                return MyDayOfWeek.values()[currentDayNumber + 1].toString();
            } else return MyDayOfWeek.values()[0].toString();
        }
    }
    public static void main(String[] args) {

     System.out.println("enter a day of week with capital letters. Example: MONDAY");
        Scanner dayInput = new Scanner(System.in);
      String usersDay = dayInput.nextLine();
        System.out.println("NEXT DAY IS"+MyDayOfWeek.valueOf(usersDay).nextDayOfWeek());






    }

}
