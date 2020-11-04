package it.agresta;

import java.util.Comparator;
import java.util.List;

public class MyListUtil {
    public List<Integer> getSortedList(List<Integer> l, boolean choice) {
        if(choice)
            l.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return (o1 - o2);
                }
            });
        else
            l.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return (o2 - o1);
                }
            });


        return l;
    }
}
