import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Inserisci il tuo nome giocatore 1: ");
    String giocatore1 = in.nextLine();
    System.out.println("Inserisci il tuo nome giocatore 2: ");
    String giocatore2 = in.nextLine();

    System.out.println(giocatore1 + " scegli la tua mossa: sasso/carta/forbice");
    String mossaGiocatore1 = in.nextLine();

    System.out.println(giocatore2 + " scegli la tua mossa: sasso/carta/forbice");
    String mossaGiocatore2 = in.nextLine();

    if (mossaGiocatore1.equals("sasso") && mossaGiocatore2.equals("carta") ||
        mossaGiocatore1.equals("forbice") && mossaGiocatore2.equals("sasso") ||
        mossaGiocatore1.equals("carta") && mossaGiocatore2.equals("forbice")) {
      System.out.println(giocatore1 + " hai vinto!");
    } else if (mossaGiocatore1.equals("sasso") && mossaGiocatore2.equals("forbice") ||
        mossaGiocatore1.equals("forbice") && mossaGiocatore2.equals("carta") ||
        mossaGiocatore1.equals("carta") && mossaGiocatore2.equals("sasso")) {
      System.out.println(giocatore2 + " hai vinto!");
    } else if (mossaGiocatore1.equals(mossaGiocatore2)) {
      System.out.println("Pareggio!!!!!!");
    }
  }
}