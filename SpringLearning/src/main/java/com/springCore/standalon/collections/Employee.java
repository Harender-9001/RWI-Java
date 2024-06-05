package com.springCore.standalon.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> addresses;
    private Set<String> projects;
    private Map<String, String> skills;
    private Properties prop;

    public Employee(String name, List<String> addresses, Set<String> projects, Map<String, String> skills, Properties prop) {
        this.name = name;
        this.skills = skills;
        this.projects = projects;
        this.addresses = addresses;
        this.prop = prop;
    }

    public Employee() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public Set<String> getProjects() {
        return projects;
    }

    public void setProjects(Set<String> projects) {
        this.projects = projects;
    }

    public Map<String, String> getSkills() {
        return skills;
    }

    public void setSkills(Map<String, String> skills) {
        this.skills = skills;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", addresses=" + addresses +
                ", projects=" + projects +
                ", skills=" + skills +
                ", prop=" + prop +
                '}';
    }
}
