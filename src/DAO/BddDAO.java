package DAO;


import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class BddDAO {
    
    public static void exportClientToText(ArrayList clients) {
        try {
            FileWriter fw = new FileWriter("./BDD/clients.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw, true);

            java.util.Iterator it = clients.iterator();
            while (it.hasNext()) {
                pw.println(it.next().toString());
            }

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void exportFournisseurToText(ArrayList fournisseurs) {
        try {
            FileWriter fw = new FileWriter("./BDD/fournisseurs.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw, true);

            java.util.Iterator it = fournisseurs.iterator();
            while (it.hasNext()) {
                pw.println(it.next().toString());
            }

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void exportProduitToText(ArrayList fournisseurs) {
        try {
            FileWriter fw = new FileWriter("./BDD/produits.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw, true);

            java.util.Iterator it = fournisseurs.iterator();
            while (it.hasNext()) {
                pw.println(it.next().toString());
            }

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void exportDevisToText(String devis, String nomFichier) {
        try {
            FileWriter fw = new FileWriter("./Devis/"+nomFichier);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw, true);
            pw.print(devis);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void exportBonCommandeToText(String bonCommande, String nomFichier) {
        try {
            FileWriter fw = new FileWriter("./BonDeCommande/"+nomFichier);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw, true);
            pw.print(bonCommande);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String importClientsFromText() {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fr = new FileReader("./BDD/clients.txt");
            BufferedReader br = new BufferedReader(fr);

            String s = br.readLine();
            while (s != null) {
                sb.append(s);
                s = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
    
    public static String importFournisseursFromText() {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fr = new FileReader("./BDD/fournisseurs.txt");
            BufferedReader br = new BufferedReader(fr);

            String s = br.readLine();
            while (s != null) {
                sb.append(s);
                s = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
    
    public static String importProduitsFromText() {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fr = new FileReader("./BDD/produits.txt");
            BufferedReader br = new BufferedReader(fr);

            String s = br.readLine();
            while (s != null) {
                sb.append(s);
                s = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
    
    public static String importDevisFromText(String fichier) {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fr = new FileReader("./Devis/"+fichier);
            BufferedReader br = new BufferedReader(fr);

            String s = br.readLine();
            while (s != null) {
                sb.append(s);
                s = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
    
    public static String importBonCommandeFromText(String fichier) {
        StringBuilder sb = new StringBuilder();
        try {
            FileReader fr = new FileReader("./BonDeCommande/"+fichier);
            BufferedReader br = new BufferedReader(fr);

            String s = br.readLine();
            while (s != null) {
                sb.append(s);
                s = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
