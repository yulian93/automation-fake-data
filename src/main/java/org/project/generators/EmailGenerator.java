package org.project.generators;


import org.project.api.Generator;
import java.util.Random;

public class EmailGenerator implements Generator {
    private  String first_name;
    private  String last_name;

    public EmailGenerator(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Object generate(EmailGenerator a) {
        String[] domains = {"gmail.com", "mail.ru", "hotmail.com "};
        int random = new Random().nextInt(99) + 1;
        int year = new Random().nextInt((2010 - 1950) + 1) + 1950;

        switch (new Random().nextInt(4) + 1) {
            case 1:
                return a.getFirst_name() + "." + a.getLast_name()+"@" + domains[new Random().nextInt(3)];
            case 2:
                return a.getLast_name() + "." + a.getFirst_name()+"@" + domains[new Random().nextInt(3)];
            case 3:
                return a.getFirst_name() + random +"@"+ domains[new Random().nextInt(3)];
            case 4:
                return a.getLast_name() + year + "@" + domains[new Random().nextInt(3)];
            default: return null;
        }
    }

}
