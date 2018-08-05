package com.program.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramComlipator {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("(\\d+)\\s+(\\S+)\\s+(.*)");
        Matcher matcher = compile.matcher("10 PRINT HELLO WORLD");
        if (matcher.find()){
            String group2 = matcher.group(0);
            String group = matcher.group(1);
            String group3 = matcher.group(2);
            String group4 = matcher.group(3);

    System.out.println(group);
            System.out.println(group2);
            System.out.println(group3);
            System.out.println(group4);
        }

    }
}
