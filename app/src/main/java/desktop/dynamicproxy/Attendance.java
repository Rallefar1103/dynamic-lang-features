package desktop.dynamicproxy;

import java.util.Date;

public class Attendance {
    private Date date;
    private boolean present;

    public boolean getPresent() {
        return this.present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date newDate) {
        this.date = newDate;
    }

    public Attendance(Date date, boolean present) {
        this.date = date;
        this.present = present;
    }
}
