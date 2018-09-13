/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.pojo;

import java.lang.reflect.Field;

/**
 *
 * @author gokul
 */
public class ServiceUtils {

    public static Item generateItemsFromObject(Object object) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException {

        Items items = new Items();
        Item item = new Item();

        for (Field f : object.getClass().getDeclaredFields()) {
            String name = f.getName();
            String value = object.getClass().getDeclaredField(name).get(object).toString();

            KeyValue keyValue = new KeyValue(name, value);
            item.getResponseItem().getKeyValue().add(keyValue);
        }
        items.getItem().add(item);
        return item;
    }

//    public static Item generateAttuneResponseItems(List<String> responseList, Object respObject) throws IllegalArgumentException, IllegalAccessException {
//
//        Item item = new Item();
//        List<KeyValue> keyValueList = item.getReponseItem();
//        for (Field f : respObject.getClass().getDeclaredFields()) {
//            Item responseItem = new Item();
//            Class clazz = f.getDeclaringClass();
//            if (clazz.equals(AttunePatientDemography.class)) {
//                responseItem = generateAttunePatientDemographyResponseItems(responseList, f);
//                item.SetResponseItem(responseItem.getReponseItem());
//            }
//            if (clazz.equals(AttuneTRFFile.class)) {
//                responseItem = generateAttuneTRFFileResponseItems(responseList, f);
//                item.SetResponseItem(responseItem.getReponseItem());
//            }
//            if (clazz.equals(AttuneAssignedPathologist.class)) {
//                responseItem = generateAttuneAssignedPathologistResponseItems(responseList, f);
//                item.SetResponseItem(responseItem.getReponseItem());
//            }
//
//            if (clazz.equals(AttuneAuthentication.class)) {
//                responseItem = generateAttuneAuthenticationResponseItems(responseList, f);
//                item.SetResponseItem(responseItem.getReponseItem());
//            }
//
//            String name = f.getName();
//            String value = "object.getClass().getDeclaredField(name).get(object).toString()";
//
//            if (responseList.contains(name)) {
//                KeyValue keyValue = new KeyValue(name, value);
//                item.getReponseItem().add(keyValue);
//            }
//        }
//
//        return item;
//    }
//
//    private static Item generateAttunePatientDemographyResponseItems(List<String> responseList, Field f) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private static Item generateAttuneTRFFileResponseItems(List<String> responseList, Field f) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private static Item generateAttuneAssignedPathologistResponseItems(List<String> responseList, Field f) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private Item generateAttuneAuthenticationResponseItems(List<String> responseList, Field f) throws IllegalArgumentException, IllegalAccessException {
//        Item item = new Item();
//        AttuneAuthentication authObject = (AttuneAuthentication) f.get(this);
//        for (Field field : authObject.getClass().getDeclaredFields()) {
//            String name = field.getName();
//            String value = field.getClass().getDeclaredField(name).get(object);
//
//            if (responseList.contains(name)) {
//                KeyValue keyValue = new KeyValue(name, value);
//                item.getReponseItem().add(keyValue);
//            }
//        }
//        return item;
//    }
}
