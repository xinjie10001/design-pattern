package com.mmgg.prototype;

public class CloneTest {

    public static void main(String[] args) {
        Prototype p = new Prototype();
        p.name = "Tom";
        p.list.add("1");

        try {
            Prototype obj = (Prototype) p.clone();
            System.out.println(obj.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
