package com.maxiannicu.imp.abstractfactory.apple;

import com.maxiannicu.abstractfactory.Headphones;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class AppleHeadphones implements Headphones {
    @Override
    public int getPower() {
        return 10;
    }
}
