// src/main/java/com/example/age_restricted/Service.java
package com.example.age_restricted;
import org.kie.api.runtime.KieSession;

public class Service {
    private Entity entity;

    public Service(boolean arg){
        this.entity = new Entity(arg);
    }
    public Entity validate(){
        KieSession kieSession = DroolsConfig.rulesSetKieContainer().newKieSession();
        kieSession.insert(this.entity);
        kieSession.fireAllRules();
        kieSession.dispose();
        return entity;
    }
}
