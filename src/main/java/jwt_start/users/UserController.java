package jwt_start.users;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public String all() {
        return "{\"users\":[{\"firstname\":\"Richard\", \"lastname\":\"Feynman\"},"
                + "{\"firstname\":\"Marie\",\"lastname\":\"Curie\"}]}";
    }
}
