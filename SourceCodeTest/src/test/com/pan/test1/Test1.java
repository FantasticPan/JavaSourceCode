package com.pan.test1;

import org.junit.Test;

import java.util.HashMap;

/**
 * Created by FantasticPan on 2018/11/7.
 */
public class Test1 {

    Integer hh() {
        return null;
    }

    int a[] = {1, 2, 3};

    @Test
    public void test1() {
        //a.add(1);
        //System.out.println(a.contains(0) == false);
        //int i = 0;
        //for (; i < 2; i++) {
        //    System.out.println(i);
        //}
        //int a[] = this.a;
        //a[1] = 10;
        //for (int i = 0; i < this.a.length; i++) {
        //    System.out.println(this.a[i]);
        //}
        //System.out.println("fff".hashCode());
        HashMap hashMap = new HashMap();
        hashMap.put("lp", 123);
        System.out.println(hashMap.size());
    }

    @Test
    public void testRequest() {
        retry:// 1（行2）
        for (int i = 0; i < 10; i++) {
            //retry:// 2（行4）
            while (i == 5) {
                continue retry;
            }
            System.out.print(i + " ");
        }
    }

}
