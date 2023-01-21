package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aIntegerValue = Integer.parseInt(a);
        int bIntegerValue = Integer.parseInt(b);
        int aFunctionResult = function(aIntegerValue);
        int bFunctionResult = function(bIntegerValue);
        if (aFunctionResult == bFunctionResult) {
            return Integer.compare(aIntegerValue, bIntegerValue);
        }
        return Integer.compare(aFunctionResult, bFunctionResult);
    }

    private int function(int x) {
        return (int) (5 + Math.pow(x, 2) + 3);
    }
}
