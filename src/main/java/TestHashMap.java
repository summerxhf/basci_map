import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Dog,Integer> hashMap = new HashMap<Dog, Integer>();
        Dog dog1 = new Dog("red");
        Dog dog2 = new Dog("black");
        Dog dog3 = new Dog("white");
        Dog dog4 = new Dog("white");

        hashMap.put(dog1,10);
        hashMap.put(dog2,15);
        hashMap.put(dog3,5);
        hashMap.put(dog4,20);
        //print size
        System.out.println("HashMap size --" + hashMap.size());

        //loop HashMap
        for(Map.Entry<Dog,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }


        Object object = new Object();


    }
}
