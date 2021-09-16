package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;



        public String toString() {
                String courseDescription = String.format("%s is the class taught by %s with %d students enrolled", this.topic, this.instructor, this.enrolledStudents.size());
                return courseDescription;
        }
}

