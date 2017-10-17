package Ex1;

import java.io.File;
import java.util.Scanner;

public class Chemin {
    public static void main (String[] args){
        System.out.println("Quel est le chemin d'accès ?");
        Scanner sc = new Scanner(System.in);


        String chemin = sc.nextLine();
        File dossier = new File(chemin);

        if (dossier.isFile()){
            System.out.println("Le chemin d'accès existe, il mène à un fichier.");
        }
        if (dossier.exists()&& dossier.isDirectory()){
            System.out.println("Le chemin d'accès existe, il mène à un repertoire.");
        }
    }
}