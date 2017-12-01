package com.maxiannicu.diversity.proxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class LinuxShellAdapter implements Shell {
    @Override
    public void execute(String command, Object... args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            list.add(command);
            Arrays.stream(args).forEach(item -> list.add(item.toString()));
            ProcessBuilder ps = new ProcessBuilder(list);

            ps.redirectErrorStream(true);

            Process pr = ps.start();

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            pr.waitFor();

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
