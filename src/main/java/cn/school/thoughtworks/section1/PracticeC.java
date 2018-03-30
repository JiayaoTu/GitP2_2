package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.*;


public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<String> ();
        List<String> value=null;
        Iterator entries = collection2.entrySet().iterator();
        while (entries.hasNext())
        {
            Map.Entry entry=(Map.Entry) entries.next();
            value=(List<String>)entry.getValue();
        }
        for(String s:collection1)
        {
            if(value.contains(s))
            {
                result.add(s);
            }
        }
        return result;
    }


}
