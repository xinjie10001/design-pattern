package com.mmgg.singleton.Lazy;

public class LazyOne {

    public LazyOne() {

    }

    public static LazyOne lazyOne = null;

    public static LazyOne getInstance(){

        if(lazyOne == null){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }



}
