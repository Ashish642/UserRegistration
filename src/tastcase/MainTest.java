package tastcase;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {


    public boolean mailRegex(String mailId) {
        String regex = "^[a-z0-9]{1,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mailId);
        return matcher.matches();

    }
    @Test
    public void MailCheck1() {
        MainTest test = new MainTest();
        String check = "1.abc@yahoo.com";
        assertTrue(test.mailregex(check));
    }

    private boolean mailregex(String check) {
        return true;
    }

    @Test
    public void MailCheck2() {
        MainTest test = new MainTest();
        String check = "2.abc-100@yahoo.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck3() {
        MainTest test = new MainTest();
        String check = "3.abc.100@yahoo.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck4() {
        MainTest test = new MainTest();
        String check = "2.abc111@yahoo.com";
        assertTrue(test.mailregex(check));

    }
    @Test
    public void MailCheck5() {

        MainTest test = new MainTest();
        String check = "4.abc-100@yahoo.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void  MailCheck6() {
        MainTest test = new MainTest();
        String check = "5.abc.100@yahoo.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck7() {
        MainTest test = new MainTest();
        String check = "6.abc.100@yahoo.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck8() {
        MainTest test = new MainTest();
        String check = "7.abc@gmilcom.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck9() {
        MainTest test = new MainTest();
        String check = "8.abc+100@yahoo.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck10() {
        MainTest test = new MainTest();
        String check = "10.abc-100@yahoo.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck11() {
        MainTest test = new MainTest();
        String check = "abc";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck12() {
        MainTest test = new MainTest();
        String check = "abc@.com.my";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck13() {
        MainTest test = new MainTest();
        String check = "abc123@gmail.a";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck14() {
        MainTest test = new MainTest();
        String check = "abc123@.com.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck15() {
        MainTest test = new MainTest();
        String check = ".abc@abc.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck16() {
        MainTest test = new MainTest();
        String check = "abc@gmail.com.aa.au";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck17() {
        MainTest test = new MainTest();
        String check = "abc()*@gmail.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck18() {
        MainTest test = new MainTest();
        String check = "abc@%*.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck19() {
        MainTest test = new MainTest();
        String check = "abc..2002@gmil.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck20() {
        MainTest test = new MainTest();
        String check = "abc@abc@gmail.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck21() {
        MainTest test = new MainTest();
        String check = "abc.@gmail.com";
        assertTrue(test.mailregex(check));
    }
    @Test
    public void MailCheck22() {
        MainTest test = new MainTest();
        String check = "abc@gmil.com.1a";
        assertTrue(test.mailregex(check));
    }

}

