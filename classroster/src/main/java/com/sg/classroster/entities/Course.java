package com.sg.classroster.entities;

import java.util.List;
import java.util.Objects;

public class Course {

    private int id;
    private String name;
    private String description;
    private Teacher teacher;
    private List<Student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (id != course.id) return false;
        if (!Objects.equals(name, course.name)) return false;
        if (!Objects.equals(description, course.description)) return false;
        if (!Objects.equals(teacher, course.teacher)) return false;
        return Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        result = 31 * result + (students != null ? students.hashCode() : 0);
        return result;
    }
}
