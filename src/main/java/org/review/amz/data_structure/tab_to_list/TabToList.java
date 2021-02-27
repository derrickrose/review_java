package org.review.amz.data_structure.tab_to_list;

import java.util.LinkedList;
import java.util.List;

public class TabToList {

    public static List<String> tabToList(String[] strings) {
        //Arrays.asList(strings.clone());
        List<String> strList = new LinkedList<>();
        //LinkedList or ArrayList

        for (String str : strings) {
            strList.add(str);
        }
        return strList;
    }
}
