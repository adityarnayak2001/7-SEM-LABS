package com.example.MySqlSpringDemo.model;

public class Valorant {

    private String id;
    private String agentRole;
    private String esportsCom;

    public Valorant(String id, String agentRole, String esportsCom) {
        this.id = id;
        this.agentRole = agentRole;
        this.esportsCom = esportsCom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAgentRole() {
        return agentRole;
    }

    public void setAgentRole(String agentRole) {
        this.agentRole = agentRole;
    }

    public String getEsportsCom() {
        return esportsCom;
    }

    public void setEsportsCom(String esportsCom) {
        this.esportsCom = esportsCom;
    }

}
