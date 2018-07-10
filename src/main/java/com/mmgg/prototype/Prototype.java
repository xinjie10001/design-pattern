package com.mmgg.prototype;

import java.util.ArrayList;

public class Prototype implements Cloneable{

    public String name;

    public ArrayList list = new ArrayList();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
