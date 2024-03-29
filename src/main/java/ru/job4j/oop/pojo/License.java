package ru.job4j.oop.pojo;

import java.util.Date;
import java.util.Objects;

public class License {
    private String owner;
    private String model;
    private String code;
    private Date creator;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        License license = (License) o;
        return Objects.equals(owner, license.owner)
                && Objects.equals(model, license.model)
                && Objects.equals(code, license.code)
                && Objects.equals(creator, license.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, creator);
    }

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
