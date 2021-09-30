import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW5 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        emailCheck();
        domainCheck();
        yearCheck();
        yearTime();
    }

    public static void task1() {
        String text1 = "ahb acb aeb aeeb adcb axeb";
        boolean result1 = text1.matches("a.*b");
        System.out.println(result1);
    }

    public static void task2() {
        String text2 = "aa aba abba abbba abca abea";
        boolean result2 = text2.equals("ab.*a+");
        System.out.println(result2);
    }

    public static void task3() {
        String text3 = "+ *q+ *qq+ *qqq+ *qqq qqq+";
        Arrays.stream(text3.split("\\s")).filter(e -> e.matches("^\\*q{0,3}\\+")).forEach(System.out::println);
    }

    public static void task4() {
        String text4 = "aa aba abba abbba abbbba abbbbba";
        Arrays.stream(text4.split("\\s")).filter(e -> e.matches("^ab{1,}a")).forEach(System.out::println);
    }

    public static void task5() {
        String text5 = "ave a#b a2b a$b a4b a5b a-b acb";
        Arrays.stream(text5.split("\\s")).filter(e -> e.matches("^a+[^a-zA-Z0-9]+b$")).forEach(System.out::println);

    }

    public static void task6() {
        String text6 = "aba aea aca aza axa a-a a#a";
        Arrays.stream(text6.split("\\s")).filter(e -> e.matches("^a+[^e,x]+a$")).forEach(System.out::println);
    }

    public static void emailCheck() {
        ArrayList<String> emails = new ArrayList<>();
        emails.add("mymail@mail.ru");
        emails.add("my.mail@google.com");
        emails.add("my-mail@i.ua");
        emails.add("my_mail@ukr.net");
        emails.add("mail@mail.com");
        emails.add("mail@mail.by");
        emails.add("mail@yandex.ru");

        for (String email : emails) {
            if (email.matches("^[\\w-_.]*[\\w-_.]@[\\w].+[\\w]+[\\w]$")) {
                boolean result = true;
                System.out.println(result);
            }
        }

    }

    public static void domainCheck() {
        ArrayList<String> domains = new ArrayList<>();
        domains.add("http://site.ua");
        domains.add("https://site.com");
        domains.add("http://my-site.com");
        domains.add("https://my.site.com");
        domains.add("http://my_site.com");

        for (String domain : domains) {
            if (domain.matches("(^(http|https)://)+((\\w)*|([0-9]*)|([-|_])*)+([\\.]((\\w)*|([0-9]*)|([-|_])*))+")) {
                boolean result = true;
                System.out.println(result);
            }
        }

    }

    public static void yearCheck() {
        ArrayList<String> years = new ArrayList<>(); //можем ли мы с интеджерами работать в регулярках или только стринг??
        years.add("1998");
        years.add("1800");
        years.add("1908");
        years.add("1988");
        years.add("2010");
        years.add("2110");
        years.add("20");
        for (String year : years) {
            if (year.matches("^(19[0-9][0-9]|20[0-9][0-9])$")) {
                boolean result = true;
                System.out.println(result);

            } else {
                System.out.println("false");
            }
        }
    }

    public static void yearTime() {
        ArrayList<String> times = new ArrayList<>(); //можем ли мы с интеджерами работать в регулярках или только стринг??
        times.add("24.00");
        times.add("25.00");
        times.add("12.60");
        times.add("12.93");
        times.add("41.93");
        times.add("01:58"); //для проверки регулярки сама дописала
        for (String time : times) {
            if (time.matches("^(([0-2][0-3]):([0-5][0-9]))$")) {
                boolean result = true;
                System.out.println(result);

            } else {
                System.out.println("false");
            }
        }

    }
}




