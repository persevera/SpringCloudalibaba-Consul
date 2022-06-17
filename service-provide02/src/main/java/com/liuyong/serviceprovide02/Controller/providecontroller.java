package com.liuyong.serviceprovide02.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class providecontroller {

    @Value("${server.port}")
    private  String  port;
    @RequestMapping("/getinfo")
    @ResponseBody
    public  String  getinfo(){
        return "端口为"+port+"的服务提供者调用成功";
    }
}
