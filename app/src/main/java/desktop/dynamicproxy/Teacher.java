package desktop.dynamicproxy;

import java.util.Date;

// In this case the teacher is the client trying to call the student but will instead call the
// proxy 
public class Teacher {
    public static void main(String[] args) {
        // DailySession is now a proxy for the Student!
        DailySession dailySession = new StudentProxy(new Attendance(new Date(), false));
        dailySession.attendLesson();
    }
}
