package com.udemy.app;

import java.util.HashMap;
import java.util.Map;

public class BbjApp {

    public static void main(String[] args) {

        Map<Integer, String> mapHM = new HashMap<>();

        mapHM.put(155, "Joe");
        mapHM.put(90, "Tom");
        mapHM.put(30, "Adam");
        mapHM.put(101, "Adam"); // 2 times same value, but associated with a different key
        mapHM.put(10, "Kate");
        mapHM.put(10, "Judy"); // rewrite the VALUE of the KEY 10 to Judy

        // use mapHM.entrySet() to return a Set
        for(Map.Entry<Integer, String> entry : mapHM.entrySet()) {
            System.out.print(" "+entry.getKey()+"-"+entry.getValue()); //101-Adam 90-Tom 10-Judy 155-Joe 30-Adam
        }
        // not ordered

        //==============================
        // replace HashMap<> by LinkedHashMap<> to preserve INSERTION ORDER

        //=============================
        // replace HashMap<> by TreeMap<> to have SORTED ORDER
        // then use mapTM2.entrySet() to get a set and iterate
        //      for (Map.Entry<Integer, String> entry : mapTM2.entrySet()) {
    }
}
