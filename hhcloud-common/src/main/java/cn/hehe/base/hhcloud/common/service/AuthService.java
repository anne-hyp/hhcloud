package cn.hehe.base.hhcloud.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hyp
 * @title: AuthService
 * @projectName hhcloud
 * @description: TODO
 * @date 2022/3/11 11:33
 */
@Component
@FeignClient("authService/oauth/test")
public interface AuthService {

    @GetMapping("hello")
    public String test();

}
