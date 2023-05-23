/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.cadastro.de.trecos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 16128412023.1
 */
public class CadastroDeTrecos {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();

    }

    public static void mainMenu() {
        System.out.println("Cadastro de Trecos\n");
        System.out.println("Menu:");
        System.out.println("\t[1] Listar todos");
        System.out.println("\t[2] Listar");
        System.out.println("\t[3] Novo");
        System.out.println("\t[4] Editar");
        System.out.println("\t[5] Apagar");
        System.out.println("\t[0] Sair");
        System.out.print("\nOpção: ");

        String option = scanner.next();

        switch (option) {
            case "0":
                exitProgram();
                break;
            case "1":
                listAll();
                break;
            case "2":
                listOne();
                break;
            case "3":
                newThing();
                break;
            case "4":
                editThing();
                break;
            case "5":
                deleteMenu();
                break;
            default:
                realoadMenu();

        }

    }
//Método que encerra o programa:

    public static void exitProgram() {
        scanner.close();
        System.out.println("Valeu!");
        System.exit(0);
    }
//Lista de todos os trechos...

    public static void listAll() {
    }

//Lista um treco específico:
    public static void listOne() {

    }

    public static void newThing() {

    }

    public static void editThing() {

    }

    public static void realoadMenu() {
        System.out.println("\n\nOpição inválida!\n\n");
        mainMenu();
    }

    public static void deleteMenu() {

    }
//Limita a tela do terminal.
    public static void clearScreem(){
        for(int i = 0; i < 100; i++){
            System.out.println("\n");
        }
    }
}
