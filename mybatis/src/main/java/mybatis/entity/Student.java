package mybatis.entity;

import java.util.Date;

public class Student {
    private Integer id;
    private  String stuno;
    private  String name;
    private Date birthday;
    private  Integer country;
    private  String hobby;
    private  Integer sex;
    private  Integer tid;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuno='" + stuno + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", country=" + country +
                ", hobby='" + hobby + '\'' +
                ", sex=" + sex +
                ", tid=" + tid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Student(Integer id, String stuno, String name, Date birthday, Integer country, String hobby, Integer sex, Integer tid) {
        this.id = id;
        this.stuno = stuno;
        this.name = name;
        this.birthday = birthday;
        this.country = country;
        this.hobby = hobby;
        this.sex = sex;
        this.tid = tid;
    }

    public Student() {
    }
}
