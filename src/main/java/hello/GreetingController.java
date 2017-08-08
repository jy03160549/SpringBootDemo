package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class GreetingController {

    @RequestMapping("/greeting")
    public ModelMap greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        ModelMap modelMap=new ModelMap();
        modelMap.put("name", name);
        return modelMap;
    }
    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

}
