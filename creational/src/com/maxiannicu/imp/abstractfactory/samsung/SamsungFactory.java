package com.maxiannicu.imp.abstractfactory.samsung;

import com.maxiannicu.abstractfactory.Factory;
import com.maxiannicu.abstractfactory.Headphones;
import com.maxiannicu.abstractfactory.Phone;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class SamsungFactory implements Factory {
    @Override
    public String getManufacturerName() {
        return "Samsung";
    }

    @Override
    public Headphones buildHeadphones() {
        return new SamsungHeadphones();
    }

    @Override
    public Phone buildPhone() {
        return new SamsungPhone();
    }
}
