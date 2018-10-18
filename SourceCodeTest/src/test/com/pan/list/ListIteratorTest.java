package com.pan.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by FantasticPan on 2018/10/18.
 */
public class ListIteratorTest {

    @Test
    public void listIteratorTest() {
        List<String> tt = new ArrayList<>(Arrays.asList("one", "two", "three", "four"));
        ListIterator<String> listIterator = tt.listIterator();
        System.out.println("原始集合元素：" + tt);
        while (listIterator.hasNext()) {
            String t = listIterator.next();
            System.out.println("下一个元素：" + t);
            int index = listIterator.nextIndex();
            if (index == 2 && listIterator.hasPrevious()) {
                System.out.println("index为" + index + "的前一个元素：" + listIterator.previous());
                System.out.println("修改index为" + index + "的前一个元素为update_two");
                listIterator.set("update_two");
                break;
            }
        }
        System.out.println("修改后的集合元素:" + tt);
    }
}
