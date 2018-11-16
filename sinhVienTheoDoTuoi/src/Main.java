import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

//        HashMap sap xep theo thu tu giam dan
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Thinh",32);
        hashMap.put("Long",31);
        hashMap.put("Thao",33);
        hashMap.put("Thuong",34);
        System.out.println("Display entries in HashMap: ");
        System.out.println(hashMap+ "\n");
//      TreeMap
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key: ");
        System.out.println(treeMap);
//      LinkedHashMap luu va hien thi thong tin cua lop do
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Thinh",32);
        linkedHashMap.put("Lewis",31);
        linkedHashMap.put("Thao",33);
        linkedHashMap.put("Thu",34);
        System.out.println("\n The age for "+ "Lewis is "+linkedHashMap.get("Lewis"));
        System.out.println("\n The age for "+ "Thao is "+linkedHashMap.get("Thao"));
    }
}
