package com.pan.string;

/**
 * Created by FantasticPan on 2018/10/20.
 */
public class StringBufferTest {

    public String replaceSpace(StringBuffer str) {
        for (int i = 0 ;i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str.deleteCharAt(i);
                str.insert(i, "%20"); //在指定位置插入字符串
            }
        }
        return str.toString();
    }
}
