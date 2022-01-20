package online.cafeteria.online.cafeteria.student;

import java.util.List;

public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "YAMIKANI",
                        "yAMIE24@gmail.com"
                )
        );

    }
