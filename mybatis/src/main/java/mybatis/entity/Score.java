package mybatis.entity;

public class Score {

    private Integer id;

    private Course course;

    private Student student;

    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", course=" + course +
                ", student=" + student +
                ", score=" + score +
                '}';
    }

    public Score(Integer id, Course course, Student student) {
        this.id = id;
        this.course = course;
        this.student = student;
    }

    public Score() {
    }
}