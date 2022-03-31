
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
       TimeDetails details = new TimeDetails();
        Scanner dre = new Scanner(System.in);

        String format = "HH:mm";
        SimpleDateFormat timeFormatter = new SimpleDateFormat(format);

        String date = timeFormatter.format(new Date());


       // System.out.println("Set your Alarm time " + "(HH:mm)");
        //details.setAlarmLabel(dre.nextLine());

        if(details.getAlarmLabel().equals(date)){
            System.out.println("***** ALARM!!!! \n" + "The time is " + date +
                    "\nIt is time for Solat!");

        }
        else {
            System.out.println("The time is: " + date);
        }

    }
}
