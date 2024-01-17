package com.yy.structure;

import java.util.BitSet;

/**
 * @author gongcy
 * @date 2023/7/18 10:09 上午
 * @Description
 */
public class BitExample {

    public static void main(String[] args) {

        // 1.设置和获取位
//        BitSet bitSet = new BitSet(8);
//        bitSet.set(2);
//        bitSet.set(5);
//        System.out.println(bitSet.get(2));
//        System.out.println(bitSet.get(3));

        // 2.清除位
//        BitSet bitSet = new BitSet(8);
//        bitSet.set(3);
//        System.out.println(bitSet.get(3));
//
//        bitSet.clear(3);
//        System.out.println(bitSet.get(3));

        // 3.逻辑运算
//        BitSet bitSet1 = new BitSet(8);
//        BitSet bitSet2 = new BitSet(8);
//        bitSet1.set(1);
//        bitSet2.set(2);
//
//        System.out.println(bitSet1.get(2));
//
////        BitSet result = new BitSet(8);
////        result.or(bitSet1);
////        result.or(bitSet2);
////
////        System.out.println(result.get(1));
////        System.out.println(result.get(2));
////        System.out.println(result.get(3));
//
//        System.out.println("逻辑运算后...");
//        bitSet1.or(bitSet2);
//        System.out.println(bitSet1.get(2));

        // 4.标记和掩码
//        BitSet bitSet = new BitSet(8);
//        int mask = 0b10101010;
//
//        for (int i = 0; i < 8; i++) {
//            if ((mask & (1 << i)) != 0) {
//                bitSet.set(i);
//            }
//        }
//
//        System.out.println(bitSet);
//
//        BitSet bitSet1 = new BitSet(8);
//        System.out.println(bitSet1);

        BitSet bitSet = new BitSet(8);
        bitSet.set(1);
        bitSet.set(3);
        bitSet.set(5);

        int nextClearIndex = bitSet.nextClearBit(1);
        System.out.println(nextClearIndex);

    }
}
