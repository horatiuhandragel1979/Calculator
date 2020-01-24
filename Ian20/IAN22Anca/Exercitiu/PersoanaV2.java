package Exercitiu;

import java.util.Objects;

public class PersoanaV2 {

    private String ocupatia;
    private String nume;

    public PersoanaV2(String ocupatia, String nume) {
        this.ocupatia = ocupatia;
        this.nume = nume;
    }

    public String getOcupatia() {
        return ocupatia;
    }

    public void setOcupatia(String ocupatia) {
        this.ocupatia = ocupatia;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


}
