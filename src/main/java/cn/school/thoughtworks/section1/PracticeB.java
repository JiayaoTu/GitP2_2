package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。

        List<String> result = new ArrayList<String>();
        Set<String> set1 = new LinkedHashSet<>();
        for (int i = 0; i < collection2.size(); i++) {
            List<String> temp = collection2.get(i);
            for (String s : collection1) {
                if (temp.contains(s)) {
                    set1.add(s);
                }
            }

        }
        for (String ss : set1)
        {
            result.add(ss);
        }
        return result;
        
    }
}


