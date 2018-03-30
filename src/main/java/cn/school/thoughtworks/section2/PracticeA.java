package cn.school.thoughtworks.section2;

import java.util.*;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        Map<String,Integer> result = new HashMap<String,Integer>();
        Set<String> temp=new LinkedHashSet<>();
        for(int i=0;i<collection1.size();i++)
        {
            temp.add(collection1.get(i));
        }
        for(String s:temp )
        {
            int count=0;
            for(int i=0;i<collection1.size();i++)
            {
                if(s==collection1.get(i))
                {
                    count++;
                }
            }
            result.put(s,count);
        }
        return result;
    }
}
