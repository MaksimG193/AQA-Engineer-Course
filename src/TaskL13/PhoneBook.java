package TaskL13;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private static int num = 0;

    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();


    public static void main(String[] args) {


        PhoneBook pb = new PhoneBook();

        pb.add("Пупкин", "8(800)555-35-35");
        pb.add("Захаров", "8(495)415-82-82");
        pb.add("Крылов", "8(800)410-20-20");
        pb.add("Перов", "8(800)474-58-58");
        pb.add("Костенко", "8(496)274-16-79");
        pb.add("Печенкин", "8(925)316-65-82");
        pb.add("Яйкин", "8(903)155-20-90");
        pb.add("Носяйкин", "8(903)675-75-10");
        pb.add("Печенкин", "8(495)613-43-04");
        pb.add("Пупкин", "8(812)123-45-45");

        for (String x : pb.get("Пупкин")) {
            num++;
            System.out.println("Пупкин" + num + " телефон: " + x);
        }
    }

    public void add(String surname, String phone) {


        ArrayList<String> strings = phoneMap.get(surname);

        System.out.println("String = " + strings);

        if (strings == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(surname, listOfPhones);
        } else {
            strings.add(phone);
            phoneMap.put(surname, strings);
        }
    }

    public ArrayList<String> get(String surname) {
        return phoneMap.get(surname);
    }

}