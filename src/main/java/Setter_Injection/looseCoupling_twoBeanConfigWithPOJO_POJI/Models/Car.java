package Setter_Injection.looseCoupling_twoBeanConfigWithPOJO_POJI.Models;

import Setter_Injection.looseCoupling_twoBeanConfigWithPOJO_POJI.Interface.Vehical;

import java.util.concurrent.TimeUnit;

public class Car implements Vehical {

    private String fuleType;
    private int maxSpeed;

    public String getFuleType() {
        return fuleType;
    }

    public void setFuleType(String fuleType) {
        this.fuleType = fuleType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startjourny() {

        System.out.println(TimeUnit.values().toString());
        System.out.println("journy Started by CAR");
        System.out.println("max speed is: "+maxSpeed);
        System.out.println("fule type is: "+fuleType);
        System.out.println(TimeUnit.values().toString());


    }
}
