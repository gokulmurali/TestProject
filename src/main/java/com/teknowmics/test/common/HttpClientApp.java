/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 *
 * @author gokul
 */
public class HttpClientApp {

    public static void main(String[] args) {
        try {

            String executeUrl = "http://www.reliply.org/tools/requestheaders.php";
            String jsonString = "{\"inputParameters\":[{\"variableName\":\"var162910418f9\",\"variableValue\":\"End Task Added\"},{\"variableName\":\"var16291043fcb\",\"variableValue\":\"100000\"},{\"variableName\":\"var1629104614a\",\"variableValue\":\"kochi\"},{\"variableName\":\"var162910484a2\",\"variableValue\":\"100000\"},{\"variableName\":\"var1629104df03\",\"variableValue\":\"Amount Amount\"},{\"variableName\":\"var162910613c5\",\"variableValue\":\"10000\"},{\"variableName\":\"var16291066df6\",\"variableValue\":\"Amount\"},{\"variableName\":\"var16291068614\",\"variableValue\":\"Amount\"},{\"variableName\":\"var16291069d5b\",\"variableValue\":\"\"},{\"variableName\":\"var1629106b54b\",\"variableValue\":\"\"},{\"variableName\":\"var1629106d0e7\",\"variableValue\":\"Kochi\"},{\"variableName\":\"var1629106f25f\",\"variableValue\":\"Kerala\"},{\"variableName\":\"var1629107282a\",\"variableValue\":\"682037\"},{\"variableName\":\"var1629108b4dd\",\"variableValue\":\"10000\"},{\"variableName\":\"var1629108d540\",\"variableValue\":\"100000\"},{\"variableName\":\"var162b4f449a6\",\"variableValue\":\"12 Months\"},{\"variableName\":\"var162910916f5\",\"variableValue\":\"12.00\"},{\"variableName\":\"var1629109425a\",\"variableValue\":\"2000\"},{\"variableName\":\"var1629142352a\",\"variableValue\":\"Address 1\"},{\"variableName\":\"var162914244f2\",\"variableValue\":\"Address 2\"},{\"variableName\":\"var1629142503a\",\"variableValue\":\"\"},{\"variableName\":\"var16291425ab6\",\"variableValue\":\"\"},{\"variableName\":\"var162914833dd\",\"variableValue\":\"Kochi\"},{\"variableName\":\"var16291489720\",\"variableValue\":\"Kerala\"},{\"variableName\":\"var1629148d51e\",\"variableValue\":\"682031\"},{\"variableName\":\"var1629109fa29\",\"variableValue\":\"2000\"},{\"variableName\":\"var162910a2946\",\"variableValue\":\"12000\"},{\"variableName\":\"var162910a5e0a\",\"variableValue\":\"2024-01-01\"},{\"variableName\":\"var162910a808f\",\"variableValue\":\"2025-01-03\"},{\"variableName\":\"var162910ab34e\",\"variableValue\":\"2\"},{\"variableName\":\"var162910ad3bf\",\"variableValue\":\"2000\"},{\"variableName\":\"var162910b0341\",\"variableValue\":\"2\"},{\"variableName\":\"var162910b31f3\",\"variableValue\":\"No\"}]}\n";
//            URIBuilder builder = new URIBuilder(executeUrl);
//            System.out.println("$$CONNECTION URL$$:" + executeUrl);
//            builder.setParameter("actionId", String.valueOf(2)).setParameter("parameterJson", jsonString);
//            HttpClient client = HttpClientBuilder.create().build();
//            HttpGet request = new HttpGet(builder.build());
//            System.out.println("External Application Url>>>>>:" + builder.build().toString());
//            HttpResponse execute = client.execute(request);
//            System.out.println(execute.toString());
//            System.out.println("$$EXECUTED$$");

            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(executeUrl);
            //post.setHeader(HttpHeaders.AUTHORIZATION, "Bearer" + " " + "AccessToken");
            post.addHeader(HttpHeaders.AUTHORIZATION, "Bearer" + " " + "AccessToken");
            post.setHeader("IsWrapReq", "Y");
            post.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
            post.setHeader(HttpHeaders.ACCEPT_LANGUAGE, "poda");
            //post.setHeader("Content-Type", "application/json");

            HttpResponse response = client.execute(post);

            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            
            System.out.println(result.toString());
        } catch (Throwable e) {

            e.printStackTrace();
        }

    }

}
