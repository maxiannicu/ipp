package com.maxiannicu.printing;

public class TwoDigitFormatter extends PrintFormatter {
    public TwoDigitFormatter(PrintFormatter next) {
        super(next);
    }

    @Override
    public void print(Object o) {
        if (o instanceof Integer || o instanceof Double || o instanceof Float){
            System.out.printf("%.2f",o);
        } else {
            redirectToNext(o);
        }
    }
}
