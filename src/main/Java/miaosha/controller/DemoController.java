package miaosha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Tony on 2018/4/8.
 */
@Controller
@RequestMapping("/")
public class DemoController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello ony!";
    }
}
