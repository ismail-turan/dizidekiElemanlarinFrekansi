import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutu :");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanı :");
            numbers[i] = scanner.nextInt();
        }
        // Diziyi küçükten büyüğe sıralayalım
        Arrays.sort(numbers);
        for (int i=0;i<n;i++){
            if ( i==0 || numbers[i-1]!=numbers[i]){
                int kackez=1;
                for (int j=i+1;j<n;j++){
                    if (numbers[i]==numbers[j]){
                        kackez+=1;
                    }
                }
                System.out.println(numbers[i]+" :"+kackez+" kere tekrar etti");
            }
        }
    }
}