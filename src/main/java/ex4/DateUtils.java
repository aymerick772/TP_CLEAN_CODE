package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /**
     *
     * @param pattern le pattern de formatage (ex: "dd/MM/yyyy")
     * @param date    la date à formater
     * @return la date formatée sous forme de chaîne
     */
    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /**
     *
     * @param date la date à formater
     * @return la date formatée sous forme de chaîne
     */
    public static String formatDefaut(Date date) {
        return format("dd/MM/yyyy HH:mm:ss", date);
    }
}
