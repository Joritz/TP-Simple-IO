package Ex3;

import java.io.File;

public class ListeurFichierTexte {
    public void listerRepertoire(File repertoire){

        String [] listefichiers;

        int i;
        listefichiers=repertoire.list();
        for(i=0;i<listefichiers.length;i++){
            if(listefichiers[i].endsWith(".txt")==true){

                System.out.println(listefichiers[i].substring(0,listefichiers[i].length()-5));// on choisit la sous chaine - les 5 derniers caracteres ".java"
            }
        }
    }
}