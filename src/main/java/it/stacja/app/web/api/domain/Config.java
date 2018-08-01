package it.stacja.app.web.api.domain;

import org.springframework.data.annotation.Id;

public class Config {

    @Id
    private String name;

    private String config;

    public Config(String name, String config) {
        this.name = name;
        this.config = config;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
