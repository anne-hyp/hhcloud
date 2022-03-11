package cn.hehe.base.hhcloud.auth.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hyp
 * @title: TestController
 * @projectName hhcloud
 * @description: TODO
 * @date 2022/3/11 10:38
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("hello")
    public String test(){
        return "hello hhcloud-auth";
    }

}
