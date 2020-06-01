package Setter_Injection.looseCoupling_twoBeanConfigWithPOJO_POJI.Models;

import Setter_Injection.looseCoupling_twoBeanConfigWithPOJO_POJI.Interface.Vehical;

import java.util.concurrent.TimeUnit;

public class Bike implements Vehical {

    private String maxSpeed;

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startjourny() {

        System.out.println(TimeUnit.values().toString());
        System.out.println("journy statred by BIKE...");
        System.out.println("fule type is: Petrol");
        System.out.println("max Speed of bike is :"+maxSpeed);
        System.out.println(TimeUnit.values().toString());

    }
}
