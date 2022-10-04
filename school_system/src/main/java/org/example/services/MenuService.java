package org.example.services;

import org.example.models.Student;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MenuService {
    //TODO: corrigir o loop infinito quando uma exception é lançada
    public static void menu(LinkedList<Student> students){
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        while (true){
            if(stop) break;

            try {
                System.out.println("MENU");
                System.out.println("(1) - Cadastrar aluno");
                System.out.println("(2) - Calcular média de um estudante");
                System.out.println("(3) - Status do estudante: APROVADO ou REPROVADO");
                System.out.println("(4) - Sair");
                int option = scanner.nextInt();
                switch (option){
                    case 1:
                        StudentService.createStudent(students);
                        break;
                    case 2:
                        Student student = StudentService.searchStudent(students);
                        if(student == null){
                            System.out.println("Não há nenhum estudante com essa matricula!");
                        }else{
                            System.out.println(student);
                        }
                        break;
                    case 3:
                        Student result = StudentService.searchStudent(students);
                        if(result == null){
                            System.out.println("Não há nenhum estudante com essa matricula!");
                        }else{
                            System.out.println(result.getSchoolReport().getResult());
                        }
                        break;
                    case 4:
                        stop = true;
                        break;
                    default:
                        System.out.println("Escolha uma opção válida!");
                }
            }catch(InputMismatchException exception){
                System.out.println("O tipo do valor inserido não é o tipo correto.");
            }
        }
    }
}
