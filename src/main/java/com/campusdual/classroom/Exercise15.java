package com.campusdual.classroom;

import java.util.Calendar;
import java.util.Date;

public class Exercise15 {

    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(23, 04, 04);
        FreshMerchandise fm = new FreshMerchandise("Manzanas", "001-9", "Frutería de ayer S.L.", 8, "C", "114D", 53, c1.getTime());
        fm.printSpecificData();
    }
}
