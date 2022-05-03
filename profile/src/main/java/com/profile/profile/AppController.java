package com.profile.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${JAVA_HOME:NENHUMA}")// imprime o caminho do java
    //@Value("${ENV_DB_URL:NENHUMA}")// imprime "nenhuma"
    private String dbEnviromentVar;

    @GetMapping("/")
    public String getAppMessage(){
        return appMessage;
    }

    @GetMapping("/env")
    public String getDbEnviromentVar(){
        return dbEnviromentVar;
    }

}
