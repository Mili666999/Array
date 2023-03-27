import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] menu = {"Caj", "Kava", "Kava s mlijekom", "Kakao", "Topla cokolada"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Sta's pop't? ");
        int izbor = sc.nextInt();
        if (izbor > 4)
            System.out.print("Opcije su od 0 do 4!");
        else
            System.out.print(menu[izbor]);
    }
}