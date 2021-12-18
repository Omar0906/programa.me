/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aux_tools.lexico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import jflex.exceptions.SilentExit;

public class Analizadorlexico {

    private static final String ruta = System.getProperty("user.dir");
    private static final String directoriolexico = "/src/main/java/aux_tools/lexico/";
    private static final String directoriosintactico = "/src/main/java/aux_tools/sintactico/";

    public Analizadorlexico(String entrada) {
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Creando Analizador Léxico");
        generarLexico(ruta.replace("\\", "/") + directoriolexico + "lexer.flex");
        System.out.println("Terminado Analizador Léxico");
        String[] rutas =
        {
            "-parser", "Syntax", ruta.replace("\\", "/") + directoriosintactico + "Syntax.cup"
        };
        System.out.println("Creando Analizador Sintáctico");
        generarSintactico(rutas, ruta.replace("\\", "/") + directoriosintactico + "Lexer_S.flex");
        System.out.println("Terminado Analizador Sintáctico");
    }

    private static void generarLexico(String ruta) {
        String[] path =
        {
            ruta
        };
        try
        {
            jflex.Main.generate(path);
        } catch (SilentExit ex)
        {
            Logger.getLogger(Analizadorlexico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void generarSintactico(String[] ruta1, String ruta2) throws IOException, Exception {
        String[] path =
        {
            ruta2
        };
        try
        {
            jflex.Main.generate(path);

            java_cup.Main.main(ruta1);
           
            Path rutaSym = Paths.get(ruta.replace("\\", "/") + directoriosintactico + "sym.java");
            Path rutaSin = Paths.get(ruta.replace("\\", "/") + directoriosintactico + "Syntax.java");
            
            if (Files.exists(rutaSym))
            {
                Files.delete(rutaSym);
            }
            if (Files.exists(rutaSin))
            {
                Files.delete(rutaSin);
            }
            Files.move(
                    Paths.get(ruta.replace("\\", "/") + "/sym.java"),
                    Paths.get(ruta.replace("\\", "/") + directoriosintactico + "sym.java")
            );
            Files.move(
                    Paths.get(ruta.replace("\\", "/") + "/Syntax.java"),
                    Paths.get(ruta.replace("\\", "/") + directoriosintactico + "Syntax.java")
            );
        } catch (SilentExit ex)
        {
            Logger.getLogger(Analizadorlexico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
