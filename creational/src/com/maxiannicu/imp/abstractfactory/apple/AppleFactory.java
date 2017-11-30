package com.maxiannicu.imp.abstractfactory.apple;

import com.maxiannicu.abstractfactory.Factory;
import com.maxiannicu.abstractfactory.Headphones;
import com.maxiannicu.abstractfactory.Phone;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class AppleFactory implements Factory {
    @Override
    public String getManufacturerName() {
        return "Apple";
    }

    @Override
    public Headphones buildHeadphones() {
        return new AppleHeadphones();
    }

    @Override
    public Phone buildPhone() {
        return new ApplePhone();
    }
}
