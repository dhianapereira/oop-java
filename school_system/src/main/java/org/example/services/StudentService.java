package org.example.services;

import org.example.models.SchoolReport;
import org.example.models.Student;
import org.example.utils.Validators;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentService {
    public static Student searchStudent(LinkedList<Student> students){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o número da matricula do estudante: ");
            int id = scanner.nextInt();
            for (int i = 0; i < students.size(); i++) {
                if(id == students.get(i).getId()){
                    return students.get(i);
                }
            }
         }catch(InputMismatchException exception){
            System.out.println("O tipo do valor inserido não é o tipo correto.");
            return null;
        }
        return null;
    }
    public static void createStudent(LinkedList<Student> students){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o número da matricula do estudante: ");
            int id = scanner.nextInt();
            System.out.print("Digite o nome do estudante: ");
            String name = scanner.next();
            System.out.print("Digite a primeira nota do estudante: ");
            double firstGrade = Validators.validateGrade(scanner.nextDouble());
            System.out.print("Digite a segunda nota do estudante: ");
            double secondGrade = Validators.validateGrade(scanner.nextDouble());
            Student student = new Student(id, name, new SchoolReport(firstGrade, secondGrade));
            students.add(student);
        } catch (InputMismatchException exception){
            System.out.println("O tipo do valor inserido não é o tipo correto.");
        } catch(Exception exception){
            System.out.println("Erro: " + exception.getMessage());
        }
    }
}
