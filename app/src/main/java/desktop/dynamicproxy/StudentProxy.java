package desktop.dynamicproxy;

public class StudentProxy extends Student {

    public StudentProxy(Attendance attendance) {
        super(attendance);
    }

    @Override
    public void attendLesson() {
        if (super.getAttendance().getPresent()) {
            super.attendLesson();
        } else {
            throw new RuntimeException("Student is not present and can't attend the lession");
        }

    }

}
