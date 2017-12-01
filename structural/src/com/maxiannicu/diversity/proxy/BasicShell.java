package com.maxiannicu.diversity.proxy;

import java.io.File;

public class BasicShell implements Shell {
    @Override
    public void execute(String command, Object... args) {
        if (command.equals("rm")) {
            File file = new File(args[0].toString());
            file.delete();
        }
        if (command.equals("sum")) {
            int a = Integer.parseInt(args[0].toString());
            int b = Integer.parseInt(args[1].toString());

            System.out.println(a+b);
        }
        if (command.equals("exit")) {
            System.out.println("Bye...");
        }
    }
}
