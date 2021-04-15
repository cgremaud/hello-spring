package org.launchcode.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
@ResponseBody


public class HelloSpringController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.PUT})
    public String form(){
        return "<html>" +
                "<body>" +
                "<form method = 'post' action = 'results'>" +
                "<input type='text' name='name' />" +
                "<select name = 'language' id = 'language'>" +
                "<option value = \"french\">French</option>" +
                "<option value = 'english'>English</option>" +
                "</select>" +
                "<button>Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("results")
    public String results(@RequestParam String name, @RequestParam String language){
        String aName = name;
        String aLanguage = language;

        return createMessage(aName, aLanguage);

//        return name + language;
    }

    public static String createMessage(String name, String language){
        if (language == "french") {
            return "Bonjour " + name;
        } else if (language == "english") {
            return "Hello, " + name;
        } else {
            return "oops";
        }
    }


}
