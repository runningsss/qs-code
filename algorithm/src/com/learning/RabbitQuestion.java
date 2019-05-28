package com.learning;

/**
 * @author liqings
 * @date 2019-05-06
 * 问题：有一只兔子，从第3个月开始每月生1只兔子，小兔子长到第3个月开始每个月也会生1只兔子， 假如兔子都不死，问每个月的兔子总数是多少？
 * 分析：乍一看觉得问题挺复杂，仔细分析之后发现，兔龄2个月及2个月以上的兔子在新的1个月每只都会生1只兔子。
 * 对于新的这个月来说，之前兔龄2个月及2个月以上的兔子就是2个月前的兔子总数，也就是说新的1个月相比上1个月增加的兔子数是2个月前的兔子数，
 * 其实就是当月的兔子数等于前两个月的兔子数之和。这样一分析，问题就很简单了，目前有两种实现方式，递归的和非递归的。先来看非递归的：
 */
public class RabbitQuestion {

    public static void main(String[] args) {
        System.out.println("第1个月的兔子数量："+1);
        System.out.println("第2个月的兔子数量："+1);
        int r1 =1,r2=1,r,m=24;
        for (int i = 3; i < m; i++) {
            //当月出生的兔子
            r = r2;
            // 总兔子对数=上月出的兔子+这月出生的兔子
            r2 = r1+r2;
            //上月出生的兔子
            r1 = r;
            System.out.println("第"+i+"个月的兔子数量："+r2);
        }
    }
}
