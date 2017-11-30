package com.maxiannicu.imp.abstractfactory.samsung;

import com.maxiannicu.abstractfactory.Phone;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class SamsungPhone implements Phone {
    @Override
    public String getModel() {
        return "s8";
    }

    @Override
    public int getRam() {
        return 4096;
    }

    @Override
    public int getCpuFrequncy() {
        return 2800;
    }
}
