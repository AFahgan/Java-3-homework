
package Assi04;
public class Registration {
    private int studentID;
    private int courseID;
    private String courseName;
    private String room;
    private int semester;

    public Registration() {
    }



    public Registration(int studentID, int CourseID, String CourseName, String room, int semester) {

        this.studentID = studentID;
        this.courseID = CourseID;
        this.courseName = CourseName;
        this.room = room;
        this.semester = semester;
    }



    public int getStudentID() {
        return studentID;
    }



    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int CourseID) {
        this.courseID = CourseID;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String CourseName) {
        this.courseName = CourseName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
}
