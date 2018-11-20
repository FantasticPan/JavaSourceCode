package com.pan.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by FantasticPan on 2018/10/20.
 */
public class ArrayListTest {

    /**
     * 遍历ArrayList
     */
    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        //list.add("Hello");
        //list.add("World");
        list.add("lipan");

        for (String str : list) {
            System.out.println("foreach遍历：" + str);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("for遍历：" + list.get(i));
        }

        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (String aStrArray : strArray) {
            System.out.println("转变成数组遍历：" + aStrArray);
        }

        //使用这种方式，迭代器对象使用完之后就被销毁了
        for (Iterator iterator1 = list.iterator(); iterator1.hasNext(); ) {
            System.out.println("迭代器for遍历：" + iterator1.next());
        }

        Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            System.out.println("迭代器while遍历：" + iterator2.next());
        }
    }
}
