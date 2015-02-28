
public class Prueba {

    public static void main(String[] args) {
        int MAX = 10012538;
        for (int i = 10004785; i < MAX; i++) {
            System.out.println(i + " ==> " + Base64.convertir(i));
        }
    }

}
