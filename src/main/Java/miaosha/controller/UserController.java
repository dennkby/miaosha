package miaosha.controller;

import miaosha.domain.User;
import miaosha.result.Result;
import miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Tony on 2018/4/10.
 */
@Controller
@RequestMapping("/miaosha")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public Result<User> getUserById(){
        User user = userService.getUserById(1);
        String a= "";
        return Result.success(user);
    }
}
