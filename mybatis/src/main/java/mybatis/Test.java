package mybatis;

import mybatis.entity.Student;
import mybatis.entity.Teacher;
import mybatis.mapper.StudentMapper;
import mybatis.mapper.TeacherMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().
                build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        final StudentMapper mapper = session.getMapper(StudentMapper.class);
        final Student student = new Student(null, "666", "ppp", new Date(),
                1, "music", 0, null);
//        mapper.insertOne(student);
        final Student student2 = new Student(6, "666", "QQQ", new Date(),
                1, "music", 0, null);
//        mapper.updateOne(student2);
//        mapper.deleteOne(6);
//        mapper.selectAll();
//        mapper.selectbyid(1);
//        final List<Student> students = mapper.selectAll();
//        System.out.println(students);
//        mapper.selectbysex(0);
//        mapper.selectCheck(1);

        final TeacherMapper mapper1 = session.getMapper(TeacherMapper.class);
//        final Teacher teacher1 = new Teacher(null, "lz", 43);
//        mapper1.insertOne(teacher1);

//        final Student student1 = mapper.selectStudentTeacherByIdN1(1);
//        System.out.println(student1);
//        System.out.println(student1.getTeacher());
//
//        final List<Student> students = mapper.selectAllStudentTeacherN1();
//        System.out.println(students);
//        students.forEach(s-> System.out.println(s.getTeacher()));

//        final List<Teacher> teachers = mapper1.selectAllTeacherStudentN1();
//        System.out.println(teachers);
//        teachers.forEach(t->{
//            System.out.println(t.getStudents());
//        });

//        final List<Student> students = mapper.selectAllStudentTeacher();
//        System.out.println(students);
//        students.forEach(s->{
//            System.out.println(s.getTeacher());
//        });

//        final List<Teacher> teachers = mapper1.selectAllTeacherStudent();
//        System.out.println(teachers);
//        teachers.forEach(t->{
//            System.out.println(t.getStudents());
//        });

//        final List<Student> students = mapper.selectAllStudentCourse();
//        System.out.println(students);
//        students.forEach(s->{
//            System.out.println(s.getCourse());
//        });

        final List<Student> students = mapper.selectAllStudentScore();
        students.forEach(s->{
            System.out.println("------------");
            System.out.println(s);
            System.out.println("=========================>");
            s.getScores().forEach(score -> System.out.println(score.getCourse()+":"+score.getScore()));
        });

        session.commit();
        session.close();
    }
}
