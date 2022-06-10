package mybatis.mapper;

import mybatis.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
//    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
//    @Insert("insert into student " +
//            "values(#{id},#{stuno},#{name},#{birthday},#{country},#{hobby},#{sex},#{tid})")
    void insertOne(Student student);

//    @Update("update student set stuno=#{stuno},name=#{name},birthday=#{birthday}," +
//            "country=#{country},hobby=#{hobby},sex=#{sex},tid=#{tid} where id=#{id}")
    void updateOne(Student student);

//    @Delete("delete from student where id=#{id}")
    void deleteOne(Integer id);

//    @Select("select * from student where id=#{id}")
    Student selectbyid(Integer id);

//    @Select("select * from student")
    List<Student> selectAll();

//    @Select("select * from student where sex=#{sex}")
    List<Student> selectbysex(Integer sex);

//    @Select("select * from student where country=#{country} and hobby  is not null")
    List<Student> selectCheck(Integer country);

    Student selectStudentTeacherByIdN1(Integer id);

    List<Student> selectAllStudentTeacherN1();

    List<Student> selectAllStudentTeacher();

    List<Student> selectAllStudentCourse();

    List<Student> selectAllStudentScore();

    List<Student> selectSomeStudentTeacher(Student condition);

}
