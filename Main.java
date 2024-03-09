import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        PhoneBook p1 = new PhoneBook();

        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Что хотите сделать?");
            System.out.println("1: Внести тестовые значения");
            System.out.println("2: Внести свои значения");
            System.out.println("3: Удалить челоека");
            System.out.println("4: Найти человека");
            System.out.println("0: Вывести на экран");
            System.out.println("q: Выйти");
            String input = scan.nextLine();
            if (input.equals("q")) break;
            switch (input){
                case ("1"):
//                    fillSprav(telSprav);
                   p1.fillSprav();
                    break;
                case ("0"):
                    p1.prinSprav();
                    break;
                case ("2"):
                   p1.addNumber();
                    break;
                case ("3"):
                    p1.removeChel();
                    break;
                case ("4"):
                    p1.findChel();
                    break;

            }

            if (input.equals("q")) break;

        }



    }
}