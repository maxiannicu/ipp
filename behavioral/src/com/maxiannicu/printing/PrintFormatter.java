package com.maxiannicu.printing;

public abstract class PrintFormatter {
    private final PrintFormatter next;

    public PrintFormatter(PrintFormatter next) {
        this.next = next;
    }

    protected void redirectToNext(Object o){
        if (this.next != null)
            next.print(o);
    }

    public abstract void print(Object o);
}
