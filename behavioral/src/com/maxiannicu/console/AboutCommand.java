package com.maxiannicu.console;

public class AboutCommand implements Command {
    @Override
    public void execute() {
        System.out.println("This program was developed as a laboratory work for IPP");
        System.out.println("Author : Nicu Maxian");
    }
}
