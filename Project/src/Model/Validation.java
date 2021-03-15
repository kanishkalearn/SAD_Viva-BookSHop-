
package Model;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {

    public static boolean isValidemail(String mail) {
        String expression2 = "^[A-Za-z]+([\\.\\w]){2,25}+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern p = Pattern.compile(expression2, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(mail);

        return m.matches();
    }

    public static boolean isValidUserName(String name) {
        Pattern p = Pattern.compile("^[A-Za-z]+[\\w]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(name);

        return m.matches();
    }

    public static void setDigitsOnly(KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    public static void setLettersOnly(KeyEvent evt) {
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }

    public static void setLength(KeyEvent evt, String text, int length) {
        if (text.length() > length - 1) {
            evt.consume();
        }
    }
    
    
    
}
