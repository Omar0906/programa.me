/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aux_tools;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author turis
 */
public class TablaSimbolos {
     private ArrayList<Simbolo> ListaTokens;

    public TablaSimbolos() {
        this.ListaTokens = new ArrayList<Simbolo>();
    }

    public void addToken(Simbolo t) {
        if (!buscarToken(t)) {
            this.ListaTokens.add(t);
            sortTabla();
        }
    }

    public void sortTabla() {
        Collections.sort(ListaTokens);
    }
    public void clear(){
        this.ListaTokens.clear();
    }

    public Boolean buscarToken(Simbolo t) {
        if(this.ListaTokens.isEmpty()){
            return false;
        }
        for (Simbolo tokens : this.ListaTokens) {
            if (tokens.getLexema().equals(t.getLexema())) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<Simbolo> verTablaSimbolos(){
        return this.ListaTokens;
    }
}
