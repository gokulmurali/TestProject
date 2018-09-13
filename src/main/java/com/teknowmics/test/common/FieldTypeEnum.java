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
public enum FieldTypeEnum {
    SINGLE_LINE(0), MULTI_LINE(1), DROP_DOWN(2), FORMULA(3);

    private final int code;

    private FieldTypeEnum (int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
