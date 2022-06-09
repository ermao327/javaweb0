package mybatis.mapper;

import mybatis.entity.Student;
import mybatis.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TeacherMapper {
//    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
//    @Insert("insert into teacher " +
//            "values(#{id},#{name},#{age})")
    void insertOne(Teacher teacher);

//    @Update("update teacher set name=#{name},age=#{age} where id=#{id}")
    void updateOne(Teacher teacher);

//    @Delete("delete from teacher where id=#{id}")
    void deleteOne(Integer id);
//
//    @Select("select * from teacher where id=#{id}")
    Teacher selectbyid(Integer id);

//    @Select("select * from teacher")
    List<Teacher> selectAll();

    List<Teacher> selectAllTeacherStudentN1();
}
