package ru.perm.v.camunda.demo.access.controller.fortest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.v.camunda.demo.access.controller.IControllerApp1;

@RestController
@RequestMapping("/api")
@Slf4j
public class RestControllerApp {
    IControllerApp1 controllerApp1;

    public RestControllerApp(IControllerApp1 controllerApp1) {
        this.controllerApp1 = controllerApp1;
    }

    @GetMapping("/echo/{msg}")
    public String echo(@PathVariable String msg) {
        return msg;
    }

    @GetMapping("/start/{keyApp}")
    public String startApp(@PathVariable String keyApp) {
        log.info("key: {}",keyApp);
        return controllerApp1.startProcessApp(keyApp);
    }
}
