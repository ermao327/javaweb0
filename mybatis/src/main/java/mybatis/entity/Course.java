package mybatis.entity;

public class Course {
    private Integer id;
    private String cno;
    private String cname;
    private Integer points;
    private String img;

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
