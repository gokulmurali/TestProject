/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.common;

import com.google.common.collect.Maps;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author gokul
 * @param <K>
 * @param <V>
 * @param <W>
 */
public class JavaTests<K, V, W> {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Map<String, String> variableMap = Maps.newHashMapWithExpectedSize(0);
        Map vMap = new HashMap(20, 0.75F);
        Set vSet = new HashSet(20, 0.75F);

        String key = null;
        String value = "null";
        variableMap.put(key, value);
        System.out.println("Keys:" + variableMap.keySet());
        System.out.println("Values:" + variableMap.values());

        Map<Long, String> resultSet = new HashMap<>();
        Map<Long, Long> fileSet = new HashMap<>();
        Map<Long, String> newSet = new HashMap<>();

        resultSet.put(1L, "one");
        resultSet.put(2L, "two");

        fileSet.put(1L, 11L);
        fileSet.put(2L, 12L);

        for (Map.Entry<Long, Long> entry : fileSet.entrySet()) {
            Long key1 = entry.getKey();
            newSet.put(entry.getValue(), resultSet.get(key1));
        }

        System.out.println("NewSet:" + newSet.toString());

        File file = new File("/home/gokul/Desktop/Storage/1/2/difference-between-mkdir-and-mkdirs-in-java-for-java-io-file/smartdocsonline/onetohundred/hundredtoonehundrednandtwentyfivethousand/itcanbedonewithease/oristpossible/shouldibeworriedabouthechangeintheaddress/itwillbedoneinanhour/threehundredtofourhundred/fivehunfdrestosixhundred/sevenhundredtoeighthundred/ninehundredtoonethousand/onetwothreefourfivesixseveneightnineten/eleventwelvethirteenfouteenfifteensixteenseventeeneighteenninenteentwenty/Untitled_Document");
        FileReader reader = new FileReader(file);
        int i;
        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
        }

        String data = "";
        data = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
        System.out.println(data);

    }

    public Map<K, V> genericMapChange(Map<K, V> resultSet, Map<K, K> fileSet) {

        Map<K, V> newSet = new HashMap<>();
        for (Map.Entry<K, K> entry : fileSet.entrySet()) {
            K key1 = entry.getKey();
            newSet.put(entry.getValue(), resultSet.get(key1));
        }
        return newSet;
    }

    public void startScan(String Catridge) {

        File file = new File(Catridge);
        List<String> folderNames = Arrays.asList(file.list());
        for (String folderName : folderNames) {
            DepthFirstTraversal(folderName);
        }

    }

    public void DepthFirstTraversal(String Folder) {

        File file = new File(Folder);
        if (file.isDirectory()) {
            List<String> fileFolderNames = Arrays.asList(file.list());
            for (String fileFolder : fileFolderNames) {
                DepthFirstTraversal(file.getAbsolutePath());
            }            
        }
        //PublishLogic
    }
}
