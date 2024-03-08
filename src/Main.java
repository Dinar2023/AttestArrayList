import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void fillSprav (HashMap<String, ArrayList> telSptav){
        ArrayList<String> tel =new ArrayList<>();
        ArrayList<String> tel1 =new ArrayList<>();
        ArrayList<String> tel2 =new ArrayList<>();
        tel.add("8-233-32-32-323");
        telSptav.put("Вася", tel);
        tel1.add( "6-666-66-66-666");
        tel1.add("6-666");
        telSptav.putIfAbsent("Boss", tel1);
        tel2.add("8-800-555-35-35");
        tel2.add("8-800-555-35-36");
        tel2.add("8-800-555-35-37");
        telSptav.putIfAbsent("Займ денег", tel2);

    }
//    static void addPerson (HashMap<String, ArrayList> telSptav){
//        System.out.println("Введите имя");
//        Scanner scan = new Scanner(System.in);
//        String name =scan.nextLine();
//        System.out.println("Введите телефон");
//        String tel = scan.nextLine();
//        ArrayList<String> temp = new ArrayList<>();
//        temp.add(tel);
//        telSptav.put(name,temp);
//
//    }

    static void addNumber (HashMap<String, ArrayList> telSptav){
        System.out.println("Введите имя");
        Scanner scan = new Scanner(System.in);
        String name =scan.nextLine();
        System.out.println("Введите телефон");
        String tel = scan.nextLine();
//         LinkedList<String> temp = new LinkedList<>();
        if (telSptav.containsKey(name)){
            telSptav.get(name).add(tel);
        }
        else {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(tel);
            telSptav.put(name,temp);
        }
    }
    static void removeChel (HashMap<String, ArrayList> telSptav){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя человека");
        String name = scan.nextLine();
        if (telSptav.containsKey(name)){
            telSptav.remove(name);
        }
        else System.out.println("Проверьте правильность имени");
    }
    static  void  findChel (HashMap<String, ArrayList> telSptav){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя человека");
        String name = scan.nextLine();
        if (telSptav.containsKey(name)){
            System.out.println(name +" "+telSptav.get(name));
        }
        else System.out.println("Проверьте правильность имени");
    }
    static  void prinSprav (HashMap<String, ArrayList> telSptav){

        TreeMap<String, ArrayList> treeSprav = new TreeMap<>(Comparator.naturalOrder());
        for (String item: telSptav.keySet()){
            treeSprav.put(item, telSptav.get(item));

        }
        telSptav.values().stream().count();
        System.out.println(telSptav);
    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HashMap <String, ArrayList> telSprav = new HashMap<>();
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
                    fillSprav(telSprav);
                    break;
                case ("0"):
                    prinSprav(telSprav);
                    break;
                case ("2"):
                    addNumber(telSprav);
                    break;
                case ("3"):
                    removeChel(telSprav);
                    break;
                case ("4"):
                    findChel(telSprav);
                    break;

            }

            if (input.equals("q")) break;

        }



    }
}
