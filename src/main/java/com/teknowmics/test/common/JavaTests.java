/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.common;

import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author gokul
 */
public class JavaTests {

    public static void main(String[] args) {

        Map<String, String> variableMap = Maps.newHashMapWithExpectedSize(0);
        Map vMap = new HashMap(20, 0.75F);
        Set vSet = new HashSet(20, 0.75F);

        String key = null;
        String value = "null";
        variableMap.put(key, value);
        System.out.println("Keys:" + variableMap.keySet());
        System.out.println("Values:" + variableMap.values());

    }
}
