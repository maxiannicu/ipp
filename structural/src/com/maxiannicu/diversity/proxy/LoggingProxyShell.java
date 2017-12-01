package com.maxiannicu.diversity.proxy;

import java.util.Arrays;

public class LoggingProxyShell implements Shell {
    private final Shell shell;

    public LoggingProxyShell(Shell shell) {
        this.shell = shell;
    }

    @Override
    public void execute(String command, Object... args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Executing command \"%s\"\n", command));
        stringBuilder.append("Arguments given : \n");
        Arrays.stream(args)
                .forEach(arg -> stringBuilder.append(String.format("\t%s\n",arg.toString())));
        stringBuilder.append("\n");

        System.out.println(stringBuilder.toString());
        shell.execute(command, args);
    }
}
