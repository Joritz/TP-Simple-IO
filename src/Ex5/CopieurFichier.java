package Ex5;

import java.io.*;

public class CopieurFichier {
    public static void main (String[] args){
        FileInputStream rd = null;
        FileOutputStream wrt = null;

        try {
            rd = new FileInputStream(new File("texte.txt"));
            wrt = new FileOutputStream(new File("texte2.txt"));


            byte[] tb = new byte[8];

            int n = 0;

            while ((n = rd.read(tb)) >= 0) {

                wrt.write(tb);

                for (byte bit : tb) {
                    System.out.println("\t" + bit + "(" + (char) bit + ")");
                }
                System.out.println("");

                tb = new byte[8];
            }
            System.out.println("Copie réalisée avec succès !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rd != null)
                    rd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
