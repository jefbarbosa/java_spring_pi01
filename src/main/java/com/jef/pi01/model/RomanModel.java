package com.jef.pi01.model;

import org.springframework.stereotype.Service;

@Service
public class RomanModel {

    public String getConverter(String number) {

        int numberInt = Integer.parseInt(number);
        String romanAlg = "";
        int multiple;

        for (int i = 1000; i >= 1 ; i/=10) {
            multiple = numberInt/i;
            if (multiple == 0 )
                continue;

            switch (i) {
                case 1000:
                    romanAlg = romanAlg.concat(SimpleConverter.thousands.get(multiple));
                    break;
                case 100:
                    romanAlg = romanAlg.concat(SimpleConverter.hundreds.get(multiple));
                    break;
                case 10:
                    romanAlg = romanAlg.concat(SimpleConverter.tens.get(multiple));
                    break;
                case 1:
                    romanAlg = romanAlg.concat(SimpleConverter.unities.get(multiple));
                    break;
            }


            numberInt = numberInt % i;
        }

        return romanAlg;
    }
}
