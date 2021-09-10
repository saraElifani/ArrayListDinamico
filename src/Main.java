import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
   public static ArrayList listaParole = new ArrayList();
    static boolean programContinue = false;

    public static void main(String[] args){
        do{
            String input = JOptionPane.showInputDialog(null, "Inserisci la frase");
            if(input == null) return;
            String[] fraseInIngresso = splitFraseInParole(input);
            riempiLista(fraseInIngresso);
            programContinue= true;
        }while (programContinue);
    }

    public static String[] splitFraseInParole(String input) {
        String[] arrayParole = input.split(" ");
        return arrayParole;
    }

    public static void riempiLista(String[] arrayParoleInput){
        for (int i=0; i < arrayParoleInput.length; i++) {
            listaParole.add(arrayParoleInput[i]);
        }
        Iterator<Integer> myIterator2 = listaParole.iterator();
        while (myIterator2.hasNext()) {
            Object myItem = myIterator2.next();
            System.out.println(myItem);
        }
        System.out.println("------------");
    }
}
