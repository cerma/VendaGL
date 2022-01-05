/*
 *  Licence Tomas Cermak
 * 
 */
package equalsmetoda;

import java.util.Objects;

/**
 *
 * @author cermak
 */
public class Data implements Cloneable {

    public String jmeno;
    public String prijmeni;
    public int DatumNarozeni;

    public Data(String jmeno, String prijmeni, int DatumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.DatumNarozeni = DatumNarozeni;
    }

    //generovani pres insert code, porovnani 2 objektu
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.jmeno);
        hash = 83 * hash + Objects.hashCode(this.prijmeni);
        hash = 83 * hash + this.DatumNarozeni;
        return hash;
    }
//generovani pres insert code, porovnani 2 objektu

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Data other = (Data) obj;
        if (this.DatumNarozeni != other.DatumNarozeni) {
            return false;
        }
        if (!Objects.equals(this.jmeno, other.jmeno)) {
            return false;
        }
        if (!Objects.equals(this.prijmeni, other.prijmeni)) {
            return false;
        }
        return true;
    }
    //metoda pro melke klonovani objektu
    public Object clone() throws CloneNotSupportedException {
        Data clovek = (Data) super.clone();
        return clovek;
    }

}
