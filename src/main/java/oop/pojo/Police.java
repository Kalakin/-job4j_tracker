package oop.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner(" Petr Arsentev ");
        license.setModel(" Toyota ");
        license.setCode(" xx111x ");
        license.setCreator(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }

}
