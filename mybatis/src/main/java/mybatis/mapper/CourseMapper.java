package mybatis.mapper;

import mybatis.entity.Course;

import java.util.List;

public interface CourseMapper {
    List<Course> selectAllCourseStudent();
}
