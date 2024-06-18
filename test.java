import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int k;
        int i = 1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen Bir Sayi Giriniz :");
        k = inp.nextInt();

        for (i = 1; i <= k; i++) {
            if (i%2 !=0) {
                continue;
            }
            System.out.println(i);
        }
    }
}



