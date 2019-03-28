package com.joe.websocket.websocketstomp.resource;

import com.joe.websocket.websocketstomp.model.User;
import com.joe.websocket.websocketstomp.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user){
        return new UserResponse(user.getId()+user.getName()+"content");
    }


}
