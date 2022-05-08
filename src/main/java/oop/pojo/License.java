package oop.pojo;

import java.util.Date;

public class License {
    private String owner;
    private String model;
    private String code;
    private Date creator;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreator() {
        return creator;
    }

    public void setCreator(Date creator) {
        this.creator = creator;
    }
}
