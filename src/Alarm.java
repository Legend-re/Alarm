import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
       TimeDetails details = new TimeDetails();
        Scanner dre = new Scanner(System.in);

        System.out.println("Set your Alarm time " + "(hrs:mins)");
        details.setAlarmLabel(dre.nextLine());

        if(details.getAlarmLabel().equals(java.time.LocalTime.now())){
            System.out.println("***** ALARM!!!! \n" + "The time is " + java.time.LocalTime.now() +
                    "\nIt is time for Solat!");

        }
        else {
            System.out.println("The time is: " + java.time.LocalTime.now());
        }

    }
}
