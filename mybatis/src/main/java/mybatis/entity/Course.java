package mybatis.entity;

import java.util.List;

public class Course {
    private Integer id;
    private String cno;
    private String cname;
    private Integer points;
    private String img;
    private List<Score> scores;

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", points=" + points +
                ", img='" + img + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Course(Integer id, String cno, String cname, Integer points, String img) {
        this.id = id;
        this.cno = cno;
        this.cname = cname;
        this.points = points;
        this.img = img;
    }

    public Course() {
    }
}
