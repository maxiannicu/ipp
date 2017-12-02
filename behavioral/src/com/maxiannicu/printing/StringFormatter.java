package com.maxiannicu.printing;

public class StringFormatter extends PrintFormatter {

    public StringFormatter(PrintFormatter next) {
        super(next);
    }

    @Override
    public void print(Object o) {
        if (o instanceof String) {
            System.out.print("String : " + o.toString());
        } else {
            redirectToNext(o);
        }
    }
}
