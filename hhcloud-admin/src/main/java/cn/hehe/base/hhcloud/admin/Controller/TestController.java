package cn.hehe.base.hhcloud.admin.Controller;

import cn.hehe.base.hhcloud.common.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hyp
 * @title: TestController
 * @projectName hhcloud
 * @description: TODO
 * @date 2022/3/11 11:41
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private AuthService authService;

    @GetMapping("helloFeign")
    public String test(){
        return authService.test();
    }

    @GetMapping("hellogateway")
    public String testGateway(){
        return "hello gateway";
    }

}
