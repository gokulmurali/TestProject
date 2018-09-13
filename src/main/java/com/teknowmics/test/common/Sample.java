/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.teknowmics.test.pojo.AttuneAssignedPathologist;
import com.teknowmics.test.pojo.AttuneAuthentication;
import com.teknowmics.test.pojo.AttuneLocationResponse;
import com.teknowmics.test.pojo.AttunePatientDemography;
import com.teknowmics.test.pojo.AttunePatientDemographyResponse;
import com.teknowmics.test.pojo.AttuneTRFFile;
import com.teknowmics.test.pojo.Item;
import com.teknowmics.test.pojo.ServiceUtils;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javafx.util.converter.LocalDateTimeStringConverter;
import java.io.File;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author gokul
 */
public class Sample {

    public static void main(String[] args) throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException {

        String jsonString = "{\n"
                + "	\"PatientDemography\": {\n"
                + "		\"PatientName\": \"SY TEST\",\n"
                + "		\"VisitNumber\": \"11171300394\",\n"
                + "		\"MLNumber\": \"ML/1900/91\",\n"
                + "		\"VisitDate\": \"2017-10-19T12:22:41.803\",\n"
                + "		\"CollectedDateTime\": \"2017-10-19T12:22:00\",\n"
                + "		\"Doctor\": \" KING\",\n"
                + "		\"AgeSex\": \"7 Year(s)/M\",\n"
                + "		\"InvestigationName\": \"AFB Rapid culture by Bactec MGIT Other\",\n"
                + "		\"History\": \"\",\n"
                + "		\"Tat\": \"2017-12-07T17:00:00\",\n"
                + "		\"TRF\": \"\",\n"
                + "		\"Location\": \"Vidyavihar\",\n"
                + "		\"OrgName\": \"Metropolis Vidyavihar\",\n"
                + "		\"ClientName\": \"GENERAL1\",\n"
                + "		\"ClientCode\": \"GENERAL\",\n"
                + "		\"ClientAddress\": \"sdgdg\",\n"
                + "		\"ExternalPatientNumber\": \"\",\n"
                + "		\"PatientVisitId\": 1076,\n"
                + "		\"OrgID\": 67,\n"
                + "		\"SampleName\": \"Other samples\",\n"
                + "		\"PatientID\": 859,\n"
                + "		\"DOB\": \"2010-10-19T00:00:00\",\n"
                + "		\"AccessionNumber\": 2379,\n"
                + "		\"ReferingPhysicianName\": \" KING\"\n"
                + "	},\n"
                + "	\"lstTRFiles\": [{\n"
                + "			\"TRFBuffer\": \"firstFile\"\n"
                + "		},\n"
                + "		{\n"
                + "			\"TRFBuffer\": \"secondFile\"\n"
                + "		},\n"
                + "		{\n"
                + "			\"TRFBuffer\": \"thirdFile\"\n"
                + "		},\n"
                + "		{\n"
                + "			\"TRFBuffer\": \"fourthFile\"\n"
                + "		}\n"
                + "	],\n"
                + "	\"lstAssignedPathologist\": [{\n"
                + "		\"AssignedPathologist\": \"Kush Raut\",\n"
                + "		\"AssignedDatetime\": \"2018-06-07T15:38:42.64\",\n"
                + "		\"AccessionNumber\": 2379\n"
                + "	}]\n"
                + "}";

        String authString = "{\n"
                + "\"access_token\": \"ACESSTOKEN_DSDJLSDJL\",\n"
                + "\"token_type\": \"bearer\",\n"
                + "\"expires_in\": 86399,\n"
                + "\"refresh_token\": \"9c2a243d3e9f49039e291389d4225803\",\n"
                + "\"as:client_id\": \"LISteknowmics\",\n"
                + "\"userName\": \"\",\n"
                + "\"isrefresh\": \"True\",\n"
                + "\".issued\": \"Thu, 07 Jun 2018 10:35:21 GMT\",\n"
                + "\".expires\": \"Fri, 08 Jun 2018 10:35:21 GMT\"\n"
                + "}";

        String auth2 = "{\"access_token\":\"kXnOUGCD3qMpJehWqt3g5Dbzk37g13dLRjIGw8GWriO_3Zz7ACqKKAr0O6qzON6RS1DHrKAp6hkdfaba7MCVageiEmDiitIhyDPGj3nEdE6UY\\nDEVYzN-n2grPkY0kmKCcx90b1XhfAqc7MeLnqXPlkdv_4g6qovKHjXerkGDBh3fC7UnBLlZv8-\\nrxZeyo5Na6HHpVKq9NHDznQ0aMxavjkerWGDbkvwYrG7sPfFOiNchfdDILYHzOAW4aT3\\nNzjIJp0C-\\nVh8moazMstyhPJIZtpnDb_FeI1ZGzXy2iHURAzxIYoZaOVF8Yjkjw87xG8_IMEglm1vJQIA9jHBYkzQOJjQswgGkthLKfuaF9RoP_znpl-Qg2HClYrtwa1tfVz5saehOMUOWRykNk61PCXXgq4jWl8dreaTy0KKAmY_J6V_F8zsDdRiWbzsbiu_R\",\"token_type\":\"bearer\",\"expires_in\":\"86399\",\"refresh_token\":\"9c2a243d3e9f49039e291389d4225803\",\"as:client_id\":\"LISteknowmics\",\"userName\":\"\",\"isrefresh\":\"TRUE\",\".issued\":\"Thu, 07 Jun 2018 10:35:21 GMT\",\".expires\":\"Fri, 08 Jun 2018 10:35:21 GMT\"}";
        String locationString = "{\n"
                + "\"status\": \"OK\",\n"
                + "\"response\": [\n"
                + "        {\n"
                + "\"LocationID\": 104,\n"
                + "\"LocationName\": \"Metropolis Vidyavihar-Vidyavihar\",\n"
                + "\"AttLocationId\": \"e8fe5a1e-b802-41d9-a268-00f4cd221153\"\n"
                + "        }\n"
                + "    ]\n"
                + "}";

        Date date = new Date();
        System.out.println(convertToDateTime(date));

        AttunePatientDemographyResponse object = (AttunePatientDemographyResponse) getObject(jsonString, AttunePatientDemographyResponse.class);
        AttuneAuthentication authObject = (AttuneAuthentication) getObject(auth2, AttuneAuthentication.class);
        Item authItem = ServiceUtils.generateItemsFromObject(authObject);
        String authJson = getJsonString(authItem);
        System.out.println("AuthJson: " + authJson);
        // System.out.println("Object: " + authObject.toString());

        AttuneLocationResponse locationResponse = (AttuneLocationResponse) getObject(locationString, AttuneLocationResponse.class);
        String locationJson = getJsonString(locationResponse);
        System.out.println(locationJson);

        Item generateItemsFromObject = new Item();
        AttunePatientDemography demography = object.getPatientDemography();
        Item demoItems = ServiceUtils.generateItemsFromObject(demography);
        generateItemsFromObject.getResponseItem().getKeyValue().addAll(demoItems.getResponseItem().getKeyValue());

        List<AttuneAssignedPathologist> lstAssignedPathologist = object.getLstAssignedPathologist();
        for (AttuneAssignedPathologist attuneAssignedPathologist : lstAssignedPathologist) {
            Item generateItems = ServiceUtils.generateItemsFromObject(attuneAssignedPathologist);
            generateItemsFromObject.getResponseItem().getKeyValue().addAll(generateItems.getResponseItem().getKeyValue());
        }

        List<AttuneTRFFile> lstTRFiles = object.getLstTRFiles();
        for (AttuneTRFFile lstTRFile : lstTRFiles) {
            Item generateItems = ServiceUtils.generateItemsFromObject(lstTRFile);
            //generateItemsFromObject.getReponseItem().addAll(generateItems.getReponseItem());
        }
        String itemJson = getJsonString(generateItemsFromObject);
        System.out.println(itemJson);

        makeXML();
    }

    public static void makeXML() {

        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("response");
            doc.appendChild(rootElement);

            Element attributes = doc.createElement("attributes");
            rootElement.appendChild(attributes);

            Element attribute = doc.createElement("attribute");
            attributes.appendChild(attribute);
            attribute.setAttribute("tag", "0x00100010");
            attribute.appendChild(doc.createTextNode("PatientName"));

            Element attribute1 = doc.createElement("attribute");
            attributes.appendChild(attribute1);
            attribute1.setAttribute("tag", "0x00100020");
            attribute1.appendChild(doc.createTextNode("PatientIdentifier"));

            Element attribute2 = doc.createElement("attribute");
            attributes.appendChild(attribute2);
            attribute2.setAttribute("tag", "0x00100030");
            attribute2.appendChild(doc.createTextNode("Patient DoB"));

            Element attribute3 = doc.createElement("attribute");
            attributes.appendChild(attribute3);
            attribute3.setAttribute("tag", "0x00100040");
            attribute3.appendChild(doc.createTextNode("Patient Sex[M, F, O]"));

            Element attribute4 = doc.createElement("attribute");
            attributes.appendChild(attribute4);
            attribute4.setAttribute("tag", "0x00080050");
            attribute4.appendChild(doc.createTextNode("Access Number/Case Identifier"));

            Element attribute5 = doc.createElement("attribute");
            attributes.appendChild(attribute5);
            attribute5.setAttribute("tag", "0x00081030");
            attribute5.appendChild(doc.createTextNode("Case Description"));

            Element attribute6 = doc.createElement("attribute");
            attributes.appendChild(attribute6);
            attribute6.setAttribute("tag", "0x101D1003");
            attribute6.appendChild(doc.createTextNode("Assigned Pathologist"));

            Element attribute7 = doc.createElement("attribute");
            attributes.appendChild(attribute7);
            attribute7.setAttribute("tag", "0x101D100C");
            attribute7.appendChild(doc.createTextNode("Case Registration/Accessioning Datetime"));

            Element attribute8 = doc.createElement("attribute");
            attributes.appendChild(attribute8);
            attribute8.setAttribute("tag", "0x101D100E");
            attribute8.appendChild(doc.createTextNode("2nd Pathologist"));

            Element attribute9 = doc.createElement("attribute");
            attributes.appendChild(attribute9);
            attribute9.setAttribute("tag", "0x00321032");
            attribute9.appendChild(doc.createTextNode("Requesting Physician Name"));

            Element attribute10 = doc.createElement("attribute");
            attributes.appendChild(attribute10);
            attribute10.setAttribute("tag", "0x301D1010");
            attribute10.appendChild(doc.createTextNode("Case Priority"));

            Element specimenDigest = doc.createElement("specimendigest");
            rootElement.appendChild(specimenDigest);

            Element specimenDigest1 = doc.createElement("attribute");
            specimenDigest.appendChild(specimenDigest1);
            specimenDigest1.setAttribute("name", "slideid");
            specimenDigest1.appendChild(doc.createTextNode("SlideID"));

            Element specimenDigest2 = doc.createElement("attribute");
            specimenDigest.appendChild(specimenDigest2);
            specimenDigest2.setAttribute("name", "blockid");
            specimenDigest2.appendChild(doc.createTextNode("blockid"));

            Element specimenDigest3 = doc.createElement("attribute");
            specimenDigest.appendChild(specimenDigest3);
            specimenDigest3.setAttribute("name", "partid");
            specimenDigest3.appendChild(doc.createTextNode("partid"));

            Element specimenDigest4 = doc.createElement("attribute");
            specimenDigest.appendChild(specimenDigest4);
            specimenDigest4.setAttribute("name", "stainname");
            specimenDigest4.appendChild(doc.createTextNode("stainname"));

            Element specimenDigest5 = doc.createElement("attribute");
            specimenDigest.appendChild(specimenDigest5);
            specimenDigest5.setAttribute("name", "tissuename");
            specimenDigest5.appendChild(doc.createTextNode("tissuename"));

            Element specimenDigest6 = doc.createElement("attribute");
            specimenDigest.appendChild(specimenDigest6);
            specimenDigest6.setAttribute("name", "normalizedslideid");
            specimenDigest6.appendChild(doc.createTextNode("normalizedslideid"));

            Element specimenDigest7 = doc.createElement("attribute");
            specimenDigest.appendChild(specimenDigest7);
            specimenDigest7.setAttribute("name", "normalizedblockid");
            specimenDigest7.appendChild(doc.createTextNode("normalizedblockid"));

            Element specimenDigest8 = doc.createElement("attribute");
            specimenDigest.appendChild(specimenDigest8);
            specimenDigest8.setAttribute("name", "normalizedpartid");
            specimenDigest8.appendChild(doc.createTextNode("normalizedpartid"));

            // shorten way
            // staff.setAttribute("id", "1");
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty("omit-xml-declaration", "yes");
            DOMSource source = new DOMSource(doc);
            //StreamResult result = new StreamResult(new File("/home/gokul/Desktop/DPSXml.xml"));

            // Output to console for testing
            String output;
            
            StringWriter writer = new StringWriter();
            //StreamResult result = new StreamResult(System.out);
            StreamResult result = new StreamResult(writer);

            transformer.transform(source, result);
            System.out.println(writer.toString());
            
            //System.out.println("File saved!");

        } catch (ParserConfigurationException | TransformerException pce) {
            pce.printStackTrace();
        }
    }

    public static Object getObject(String json, Class classObj) {
        try {
            if (null == json) {
                return null;
            }
            ObjectMapper mapper = new ObjectMapper();
            Object object = mapper.readValue(json, classObj);
            return object;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static String getJsonString(Object classObj) {
        if (null == classObj) {
            return null;
        }
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(classObj);
        } catch (Exception exp) {
            exp.printStackTrace();
            return null;
        }
        return json;
    }

    public static String convertToDate(Date date) {

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyymmdd");
        String dateString = dateFormatter.format(date);
        return dateString;
    }

    public static String convertToDateTime(Date date) {

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyymmddhhmmss");
        String dateString = dateFormatter.format(date) + "000000";
        return dateString;
    }
}
