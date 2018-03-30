package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        List<String> list = object.get("value");
        for(String s : collectionA.keySet()){
            if(list.contains(s)) {
                int temp = collectionA.get(s);
                collectionA.put(s, temp-(temp/3));
            }
        }
        return collectionA;
    }
}
