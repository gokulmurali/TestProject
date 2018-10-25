/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.common;

/**
 *
 * @author gokul
 */
@SuppressWarnings("deprecation")
public class AnnotationExcercise {

    public static void main(String... args) {

        House house = new MyHouse();

        house.open();

    }
}

interface House {

    @Deprecated
    void open();

    void openFrontDoor();

    void openBackDoor();
}

class MyHouse implements House {

    @Override
    public void open() {
        System.out.println("House Opened!!");
    }

    @Override
    public void openFrontDoor() {
    }

    @Override
    public void openBackDoor() {
    }

}
