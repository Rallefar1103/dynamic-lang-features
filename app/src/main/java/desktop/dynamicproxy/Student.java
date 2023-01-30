package desktop.dynamicproxy;

public class Student implements DailySession {
    private Attendance attendance;

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public Student(Attendance attendance) {
        this.attendance = attendance;
    }

    @Override
    public void attendLesson() {
        System.out.println("Hello, I'm attending today's lesson");
    }

}
