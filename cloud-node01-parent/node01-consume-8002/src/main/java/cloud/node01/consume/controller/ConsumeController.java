package cloud.node01.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@RestController
public class ConsumeController {

    @Autowired
    private RestTemplate restTemplate ;

    String server_name = "node01-provider-8001" ;

    @RequestMapping("/showInfo")
    public Map<String,String> showInfo (){
        return restTemplate.getForObject("http://"+server_name+":8001/getInfo",Map.class) ;
    }

}
