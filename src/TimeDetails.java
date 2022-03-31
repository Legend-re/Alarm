import java.time.LocalDateTime;


public class TimeDetails {

    public String alarmLabel = "17:00";
    public LocalDateTime date;

/*    public TimeDetails(LocalDate date) {
        this.date = date;
    }
*/

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getAlarmLabel() {
        return alarmLabel;
    }

    public void setAlarmLabel(String alarmLabel) {
        this.alarmLabel = alarmLabel;
    }
}

