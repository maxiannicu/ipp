package com.maxiannicu.imp.abstractfactory.samsung;

import com.maxiannicu.abstractfactory.Headphones;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class SamsungHeadphones implements Headphones {
    @Override
    public int getPower() {
        return 15;
    }
}
