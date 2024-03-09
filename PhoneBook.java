import java.util.*;

public class PhoneBook {
    public HashMap<String, ArrayList> telSprav = new HashMap<>();
    public void fillSprav (){
        ArrayList<String> tel =new ArrayList<>();
        ArrayList<String> tel1 =new ArrayList<>();
        ArrayList<String> tel2 =new ArrayList<>();
        tel.add("8-233-32-32-323");
        telSprav.put("Вася", tel);
        tel1.add( "6-666-66-66-666");
        tel1.add("6-666");
        telSprav.putIfAbsent("Boss", tel1);
        tel2.add("8-800-555-35-35");
        tel2.add("8-800-555-35-36");
        tel2.add("8-800-555-35-37");
        telSprav.putIfAbsent("Займ денег", tel2);

    }
    public void addNumber (){
        System.out.println("Введите имя");
        Scanner scan = new Scanner(System.in);
        String name =scan.nextLine();
        System.out.println("Введите телефон");
        String tel = scan.nextLine();
//         LinkedList<String> temp = new LinkedList<>();
        if (telSprav.containsKey(name)){
            telSprav.get(name).add(tel);
        }
        else {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(tel);
            telSprav.put(name,temp);
        }
    }
    public void removeChel (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя человека");
        String name = scan.nextLine();
        if (telSprav.containsKey(name)){
            telSprav.remove(name);
        }
        else System.out.println("Проверьте правильность имени");
    }
    public   void  findChel (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя человека");
        String name = scan.nextLine();
        if (telSprav.containsKey(name)){
            System.out.println(name +" "+telSprav.get(name));
        }
        else System.out.println("Проверьте правильность имени");
    }


    Comparator nc = new Comparator() {
    @Override

    public int compare (Object o1, Object o2) {
        if (telSprav.get(o1).size()-telSprav.get(o2).size()==0) return 1;
        return telSprav.get(o2).size()-telSprav.get(o1).size();
    }
};

    public   void prinSprav (){
        Comparator newComp = new Comp1();

        TreeMap<String, ArrayList<String>> treeSprav = new TreeMap<String, ArrayList<String>>(nc);
        for (String item: telSprav.keySet()){
            treeSprav.put(item, telSprav.get(item));

        }

        System.out.println(treeSprav);
    }


}
