package com.anywhere.test;

import com.anywhere.test.response.ResponseFactory;
import com.anywhere.test.response.SimpleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ResponseFactory factory;

    /**
     * Default simple action
     *
     * @param string string GET parameter
     * @return simple response
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    SimpleResponse simple(@RequestParam(value = "string", required = false, defaultValue = "") String string) {
        return factory.create(string, new Date());
    }
}
