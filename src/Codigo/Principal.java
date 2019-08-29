/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *
 * @author owner
 */
public class Principal {
    public static void main(String[] args) throws IOException, Exception {
        String ruta1="C:\\Users\\owner\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\Codigo\\Lexer.flex";
        String ruta2="C:\\Users\\owner\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\Codigo\\LexerCup.flex";
        String [] rutas={"-parser","Sintax","C:\\Users\\owner\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\Codigo\\Sintax.cup"};
        generador(ruta1,ruta2,rutas);
    }

    private static void generador(String ruta1,String ruta2,String []rutas) throws IOException, Exception {
        File archivo;
        archivo = new File(ruta1);
        jflex.Main.generate(archivo);
        archivo = new File(ruta2);
        jflex.Main.generate(archivo);
        java_cup.Main.main(rutas);
        
        Path rutaSym = Paths.get("C:\\Users\\owner\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\Codigo\\sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:\\Users\\owner\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\Codigo\\sym.java"), 
                Paths.get("C:\\Users\\owner\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\Codigo\\sym.java")
        );
        Path rutaSin = Paths.get("E:/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:\\Users\\owner\\Documents\\NetBeansProjects\\AnalizadorSintactico\\Sintax.java"), 
                Paths.get("C:\\Users\\owner\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\Codigo\\Sintax.java")
        );
    }
    
}
