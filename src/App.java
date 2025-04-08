import org.lessons.java.JavaCiclabile;

public class App {
    public static void main(String[] args) throws Exception {
        JavaCiclabile esempio = new JavaCiclabile();
        esempio.toStringArray();
        for (int i = 0; i < esempio.GetArrayIntero().length + 1; i++) {
            System.out.println("Numero corrente: " + esempio.GetElementoSuccessivo());
            System.out.println(String.format("%s",
                    esempio.HasAncoraElementi() ? "--ci sono ancora numeri" : "--sono finiti i numeri"));
        }

        //bonus
        for (int i = 0; i < 2; i++) {
            esempio.addElemento();
        }
        esempio.toStringArray();
    }
}
