package com.yy.basic.object;

/**
 * @author gongcy
 * @date 2023/2/17 4:27 下午
 * @Description
 */
public class EnumClass {

    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            System.out.println(s + " ordinal: " + s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING) + " ");
            System.out.println(s.equals(Shrubbery.CRAWLING) + " ");
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("********");
        }

        for (String s : "HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s);
            Shrubbery hanging = Shrubbery.valueOf("HANGING");
            System.out.println("----" + hanging);
            System.out.println(shrubbery);
        }
    }
}
