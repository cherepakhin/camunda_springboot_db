package ru.perm.v.camunda.demo.access.controller;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ControllerApp1 implements IControllerApp1 {

    private final RuntimeService runtimeService;

    public ControllerApp1(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @Override
    public String startProcessApp(String keyApp) {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(keyApp);
        log.info("process: {}", new ProcessInstanceDto(processInstance));
        return processInstance.getRootProcessInstanceId();
    }
}
