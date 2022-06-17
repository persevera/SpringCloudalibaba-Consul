package com.liuyong.serviceconsumer.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Controller
public class doconsumer {
    public static final String INVOME_URL = "http://consul-provider-payment/provide";


    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/getinfo")
    @ResponseBody
    public  String  getinfo(){
        return  restTemplate.getForObject(INVOME_URL+"/getinfo",String.class);
    }
}
