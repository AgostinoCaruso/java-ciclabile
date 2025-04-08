import org.lessons.java.JavaCiclabile;

public class App {
    public static void main(String[] args) throws Exception {
        //base
        System.out.println("***Base***");
        int[] arrayProva = {0,1,2,3};
        JavaCiclabile esempio = new JavaCiclabile(arrayProva);
        esempio.toStringArray();
        for (int i = 0; i < esempio.GetArrayIntero().length + 1; i++) {
            System.out.println("Numero corrente: " + esempio.GetElementoSuccessivo());
            System.out.println(String.format("%s",
                    esempio.HasAncoraElementi() ? "--ci sono ancora numeri" : "--sono finiti i numeri"));
        }

        //bonus
        JavaCiclabile esempioBonus = new JavaCiclabile();
        System.out.println("\n***Bonus***");
        for (int i = 0; i < 2; i++) {
            esempioBonus.addElemento();
        }
        esempioBonus.toStringArray();

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("base: ");
        esempio.toStringArray();
        System.out.println("bonus: ");
        esempioBonus.toStringArray();
    }
}
