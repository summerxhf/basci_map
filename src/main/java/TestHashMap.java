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
        //计算两个对象的hashcode
        int dog3HashCode = dog3.hashCode();
        int dog4HashCode = dog4.hashCode();
        System.out.println("dog3对象的hashcode值为--"+ dog3HashCode + "--dog4对象的hashcode值为--" + dog4HashCode);

        HashMap<String,String> hashMap1 = new HashMap<String, String>();
        hashMap1.put("123","123");
        hashMap1.put("123","456");
        for(Map.Entry<String,String> entry:hashMap1.entrySet()){
            //两个字符串是相等的.说明
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }

        String testString1 = "123";
        String testString2 = "123";
        System.out.println(testString1.hashCode() + "----" +  testString2.hashCode());;

        HashMap<String,String> stringHashMap = new HashMap<String, String>();
        stringHashMap.put(testString1,testString1);
        stringHashMap.put(testString2,testString2);

        for(Map.Entry<String,String> entry:stringHashMap.entrySet()){

        }
    }
}
