package com.maxiannicu.printing;

public class IntegerFormatter extends PrintFormatter {
    public IntegerFormatter(PrintFormatter next) {
        super(next);
    }

    @Override
    public void print(Object o) {
        if (o instanceof Integer) {
            System.out.print("Integer : " + o);
        } else {
            redirectToNext(o);
        }
    }
}
