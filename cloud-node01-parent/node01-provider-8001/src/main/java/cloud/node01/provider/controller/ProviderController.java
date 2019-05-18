package cloud.node01.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ProviderController {

    private static final Logger LOG = LoggerFactory.getLogger(ProviderController.class) ;

    @RequestMapping("/getInfo")
    public Map<String,String> getInfo (){
        LOG.info("node01-provider-8003 提供服务");
        Map<String,String> infoMap = new HashMap<>() ;
        infoMap.put("作者：","DZ") ;
        infoMap.put("时间：","2019-05-18") ;
        infoMap.put("主题：","SpringCloud微服务框架") ;
        return infoMap ;
    }
}
