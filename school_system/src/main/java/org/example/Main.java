package org.example;

import org.example.services.MenuService;
import org.example.models.Student;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        MenuService.menu(students);
    }
}
