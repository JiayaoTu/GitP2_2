package cn.school.thoughtworks.section2;

import java.util.*;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> collection3 = new HashMap<>();
        for (String s : collection1) {

            if (s.length() > 1 ) {

                String[] temp = s.split("-");
                if(temp.length==2)
                {
                    s = temp[0];
                    if(collection3.get(s) == null)
                    {
                        collection3.put(s, Integer.parseInt(temp[1]));
                    }else{
                        collection3.put(s,collection3.get(s)+Integer.parseInt(temp[1]) );
                    }


                }

            } else {
                collection3.put(s, collection3.get(s) == null ? 1 : collection3.get(s) + 1);
            }
        }

        return collection3;

    }

}
