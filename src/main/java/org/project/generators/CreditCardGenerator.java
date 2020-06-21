package org.project.generators;


import org.project.api.Generator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CreditCardGenerator implements Generator {
    private String financialService;

    public CreditCardGenerator(String financialService) {
        this.financialService = financialService;
    }

    public String getFinancialService() {
        return financialService;
    }

    public Object generate(CreditCardGenerator a) {
        String card=" Number: ";
        Date date= new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int year= Integer.parseInt(dateFormat.format(date).toString(),10)+5;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.");
        if(a.getFinancialService().toUpperCase().equals("VISA")) {
            card += 4;}
        if(a.getFinancialService().toLowerCase().equals("mastercard")) {
            card += 53;}
        if(a.getFinancialService().toLowerCase().equals("maestro")) {
            card += 10;}
        for (int i = 0; i < 16; i++) {
                card += new Random().nextInt(10);
            }
            card += "\n Expire date: "+simpleDateFormat.format(date)+year;
            card += "\n PIN: ";
            for (int i=0;i<4;i++){
                card+=new Random().nextInt(10);
            }
         return card;
        }

}

