package impls;

import java.util.List;

import Model.User;
import Model.Student;

public interface StudentService<T extends User> {
    void add(Student student);
    void remove(Student student);
    void addAppend(Student student);
    void read();
    List<Student> getAllStudents();
}
