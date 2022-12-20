package org.example;

import com.intellij.workspaceModel.ide.impl.legacyBridge.module.roots.SourceRootTypeRegistry;
import org.jetbrains.jps.cache.statistics.SystemOpsStatistic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class checkDuplicate {
    private String data;

    public void setData(String data) {
        this.data = data;
    }


    String arr[];

    public Map stringCounter() {
        Map<String, Integer> strCount = new HashMap<>();
        arr = data.split(" ");

        for (String s : arr) {
            if (strCount.containsKey(s)) {
                strCount.replace(s, strCount.get(s) + 1);
            } else {
                strCount.put(s, 1);
            }
        }
        return strCount;
    }


    public static void main(String[] ars) {
        String s = "hi this is a hi , to check the hi , to know how many hi";

        checkDuplicate ch = new checkDuplicate();

        ch.setData(s);
        //System.out.println(ch.stringCounter());
        ch.stringCounter().forEach((key, value) -> {
            System.out.printf("\"%s\" - %s \n", key, value);
        });

        System.out.println(ch.stringCounter().entrySet());

    }


}