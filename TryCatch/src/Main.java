import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". elemanı giriniz : ");
            int e = input.nextInt();
            arr[i] = e;
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("İndex'i giriniz : ");

        int indexNumber = input.nextInt();

        catchException(arr, indexNumber);
    }

    /*
    10 elemanlı bir dizi oluşturuyoruz.Daha sonra kullanıcıda bir index numarası alıyoruz
    tanımladığımız array'i ve index numarasını catchException isimli metota yolluyoruz.
    Hata varsa hatayı getMessage yöntemiyle alıyoruz.
     */

    public static void catchException(int[] arr, int index) {
        try {
            System.out.println(index + ". index = " + arr[index]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Kod Sona Erdi.");
        }
    }
}