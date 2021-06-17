package ru.perm.v.camunda.demo.access.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.camunda.bpm.engine.runtime.ProcessInstance;

@Getter
@Setter
@ToString
public class ProcessInstanceDto {
    private String rootProcessInstanceId;
    private String processDefinitionId;
    private String caseInstanceId;
    private String businessKey;

    public ProcessInstanceDto() {
    }

    public ProcessInstanceDto(ProcessInstance instance) {
        this.businessKey = instance.getBusinessKey();
        this.caseInstanceId = instance.getCaseInstanceId();
        this.processDefinitionId=instance.getProcessDefinitionId();
        this.rootProcessInstanceId=instance.getRootProcessInstanceId();
    }


}
