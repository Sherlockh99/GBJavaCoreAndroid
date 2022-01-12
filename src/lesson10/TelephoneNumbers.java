package lesson10;

import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneNumbers {
    private HashMap<String, ArrayList> contacts = new HashMap<>();

    public void addNumber(String fullName, int telNumber){
        //ArrayList telNumbers = contacts.getOrDefault(fullName,null);
        ArrayList telNumbers = contacts.get(fullName);
        if(telNumbers==null){
            telNumbers = new ArrayList();
        }
        telNumbers.add(telNumber);
        contacts.put(fullName,telNumbers);
    }

    public void getNumbers(String fullName){
        //ArrayList telNumbers = contacts.getOrDefault(fullName,null);
        ArrayList telNumbers = contacts.get(fullName);
        if(telNumbers!=null){
            System.out.println(fullName + ": " + telNumbers);
        }
    }
}
