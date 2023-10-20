package school_mng;

import school_mng.student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class schoolMng {
    public static void main(String[] args) {
        List<student> students = new ArrayList<>();
        students.add(new student(1001, "Tom", "Bachelor's of Computer science", "Java;Python;C++", 20, 2022, 10000, "Yes"));
        students.add(new student(1002, "Aaron", "Bachelor's of Artificial Intelligence", "Python;NLP;statistics", 21, 2023, 15000, "No"));
        students.add(new student(1003, "Ryan", "Bachelor's of Cyber security", "Cryptography;Cyber threats;Networks and security", 20, 2022, 12000, "Yes"));
        students.add(new student(1004, "Alex", "Bachelor's of Computer science", "Java;Python;C++", 19, 2022, 10000, "Yes"));
        students.add(new student(1005, "Dorian", "Bachelor's of Computer science", "Java;Python;C++", 20, 2022, 10000, "Yes"));
        students.add(new student(1006, "Teena", "Bachelor's of Cyber security", "Cryptography;Cyber threats;Networks and security", 19, 2022, 12000, "Yes"));
        students.add(new student(1007, "James", "Bachelor's of Artificial Intelligence", "Python;NLP;statistics", 21, 2022, 15000, "Yes"));
        students.add(new student(1008, "Cathy", "Bachelor's of Computer science", "Java;Python;C++", 20, 2023, 10000, "No"));
        students.add(new student(1009, "sherif", "Bachelor's of Cyber security", "Cryptography;Cyber threats;Networks and security", 21, 2023, 12000, "Yes"));
        students.add(new student(1010, "John", "Bachelor's of Artificial Intelligence", "Python;NLP;statistics", 20, 2023, 15000, "Yes"));
        students.add(new student(1011, "Mathew", "Bachelor's of Cyber security", "Cryptography;Cyber threats;Networks and security", 19, 2022, 12000, "No"));
        students.add(new student(1012, "George", "Bachelor's of Computer science", "Java;Python;C++", 20, 2022, 10000, "Yes"));
        students.add(new student(1013, "steve", "Bachelor's of Computer science", "Java;Python;C++", 19, 2022, 10000, "No"));
        students.add(new student(1014, "Chris", "Bachelor's of Artificial Intelligence", "Python;NLP;statistics", 20, 2023, 15000, "Yes"));
        students.add(new student(1015, "Andriya", "Bachelor's of Artificial Intelligence", "Python;NLP;statistics", 19, 2023, 15000, "Yes"));

        // sort by age
//        Collections.sort(students, Comparator.comparingInt(student::getAge));
//
//        for (student student : students) {
//            System.out.println(student);
//        }

        // sort by year
        Collections.sort(students, Comparator.comparingInt(student::getYear));

        for (student student : students) {
            System.out.println(student);
        }
    }
}