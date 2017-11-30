package com.maxiannicu.abstractfactory;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public interface Factory {
    String getManufacturerName();
    Headphones buildHeadphones();
    Phone buildPhone();
}
