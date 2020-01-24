import java.util.Objects;

public class PersoanaV2 {

    private String CNP;
    private String nume;
    private String telefon;
    private Integer varsta;

    @Override
    public String toString() {
        return "PersoanaV2{" +
                "CNP='" + CNP + '\'' +
                ", nume='" + nume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    /**
     * equals() compara continutul fiecarui obiect pentru a vedea daca sunt la fel
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersoanaV2 that = (PersoanaV2) o;
        return Objects.equals(CNP, that.CNP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CNP);
    }

    public PersoanaV2(String CNP, String nume, String telefon, Integer varsta) {
        this.CNP = CNP;
        this.nume = nume;
        this.telefon = telefon;
        this.varsta = varsta;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
