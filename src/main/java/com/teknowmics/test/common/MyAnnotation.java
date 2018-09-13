/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.common;

import java.lang.annotation.Documented;

/**
 *
 * @author gokul
 */
@Documented
public @interface MyAnnotation {

    String author() default "Gokul";

    String date();

    String modifiedDate() default "NA";

    String modifiedBy() default "NA";
}
