package com.learning;

/**
 * @author liqings
 * @date 2019-05-06
 * 1000以内能被3整除的数
 */
public class Division3 {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
