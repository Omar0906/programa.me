/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aux_tools.lexico;
import java.util.logging.Level;
import java.util.logging.Logger;
import jflex.exceptions.SilentExit;
public class Analizadorlexico{
    private static String ruta = System.getProperty("user.dir");
    private static String directoriolexico = "/src/main/java/aux_tools/lexico/";
    
    public Analizadorlexico(String entrada){
    }
    public static void main(String[] args){
        generarLexico(ruta.replace("\\", "/")+directoriolexico+"lexer.flex");
        
    }
    private static void generarLexico(String ruta){
        String[] path = {ruta};
        try {
            jflex.Main.generate(path);
        } catch (SilentExit ex) {
            Logger.getLogger(Analizadorlexico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
