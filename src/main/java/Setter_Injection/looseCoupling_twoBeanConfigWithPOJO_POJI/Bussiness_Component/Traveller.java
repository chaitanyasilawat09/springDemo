package Setter_Injection.looseCoupling_twoBeanConfigWithPOJO_POJI.Bussiness_Component;

import Setter_Injection.looseCoupling_twoBeanConfigWithPOJO_POJI.Interface.Journy;
import Setter_Injection.looseCoupling_twoBeanConfigWithPOJO_POJI.Interface.Vehical;

public class Traveller implements Journy {

    public Vehical getV() {
        return v;
    }

    public void setV(Vehical v) {
        this.v = v;
    }

    private Vehical v;

    @Override
    public void startjourny() {

        System.out.println("START Traveller class StartJourny");
        v.startjourny();
        System.out.println("END Traveller class StartJourny");

    }

}
