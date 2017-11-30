package com.maxiannicu.imp.abstractfactory.apple;

import com.maxiannicu.abstractfactory.Phone;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class ApplePhone implements Phone {
    @Override
    public String getModel() {
        return "iPhone X";
    }

    @Override
    public int getRam() {
        return 4096;
    }

    @Override
    public int getCpuFrequncy() {
        return 2400;
    }
}
