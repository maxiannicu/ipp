package com.maxiannicu.diversity.proxy;

public class Main {
    public static void main(String[] args){
        Shell shell = new LoggingProxyShell(new BasicShell());

        shell.execute("sum",1,2);

        LinuxShellAdapter linuxShellAdapter = new LinuxShellAdapter();
        linuxShellAdapter.execute("ls");
    }
}
