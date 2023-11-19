// 11. Есть текст со списками цен. Извлечь из него цены в USD, RUR, EU.
//        – пример правильных выражений: 23.78 USD.
//        – пример неправильных выражений: 22 UDD, 0.002 USD.

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String regex = "\\b\\d+(\\.\\d{1,2})?\\s*RUB\\b";
        String regex2 = "\\b\\d+(\\.\\d{1,2})?\\s*USD\\b";
        String regex3 = "\\b\\d+(\\.\\d{1,2})?\\s*EU\\b";
        String s = "Цены на товары: 10 USD, 20 UDD, 7 USD, 100.4 RUB, 75 RUR, 50.10 RUB, 2 EU, 5 EE.";
        Pattern p1 = Pattern. compile (regex);
        Pattern p2 = Pattern. compile (regex2);
        Pattern p3 = Pattern. compile (regex3);
        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        Matcher m3 = p3.matcher(s);
        while (m1.find()) {
            System.out.println("RUB: " + m1.group());
        }
        while (m2.find()) {
            System.out.println("USD: " + m2.group());
        }
        while (m3.find()) {
            System.out.println("EU: " + m3.group());
        }
    }
}

