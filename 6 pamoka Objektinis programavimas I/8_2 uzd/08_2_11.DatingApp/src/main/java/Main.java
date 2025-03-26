
public class Main {

    public static void main(String[] args) {
        SimpleDate now = new SimpleDate(13, 2, 2015);
        SimpleDate afterOneWeek = now;
        afterOneWeek.advance(7);

        System.out.println("Now: " + now);
        System.out.println("After one week: " + afterOneWeek);

        //------------------
//        SimpleDate date = new SimpleDate(13, 2, 2015);
//        System.out.println("Friday of the examined week is " + date);
//
//        SimpleDate newDate = date.afterNumberDays(7);
//        int week = 1;
//        while (week <= 7) {
//            System.out.println("Friday after " + week + "  week is " + newDate);
//            newDate = newDate.afterNumberDays(7);
//            week = week + 1;
//        }
//
//        System.out.println("The date after 790 days from the examined Friday is ...");

        //---------------
//        date.advance(5);
//        System.out.println("Friday of the examined week is " + date);

        //---------------
//        date.advance();
//        date.advance();
//        date.advance();
//        date.advance();
//        System.out.println("Friday of the examined week is " + date);
    }
}
