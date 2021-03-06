package oop.semesterprojekt.enp.OOP_Semesterprojekt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Lebensmittelprodukt extends Produkt {

    @Column
    private Date mindeshaltbarkeitsdatum;

    @Column
    private boolean vegan;

    @Column
    private boolean vegetarisch;

    @Column
    private boolean tierisch;

    @Column
    private boolean glutenfrei;

    @Column
    private boolean laktosefrei;

    @Column
    private boolean zuckerfrei;

    @Column
    private String[] inhaltsstoffe;

    /**
     *
     * @return
     */
    public Date getMindeshaltbarkeitsdatum() {
        return mindeshaltbarkeitsdatum;
    }

    /**
     *
     * @param mindeshaltbarkeitsdatum
     */
    public void setMindeshaltbarkeitsdatum(Date mindeshaltbarkeitsdatum) {
        this.mindeshaltbarkeitsdatum = mindeshaltbarkeitsdatum;
    }

    /**
     *
     * @return
     */
    public boolean isVegan() {
        return vegan;
    }

    /**
     *
     * @param vegan
     */
    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    /**
     *
     * @return
     */
    public boolean isVegetarisch() {
        return vegetarisch;
    }

    /**
     *
     * @param vegetarisch
     */
    public void setVegetarisch(boolean vegetarisch) {
        this.vegetarisch = vegetarisch;
    }

    /**
     *
     * @return
     */
    public boolean isTierisch() {
        return tierisch;
    }

    /**
     *
     * @param tierisch
     */
    public void setTierisch(boolean tierisch) {
        this.tierisch = tierisch;
    }

    /**
     *
     * @return
     */
    public boolean isGlutenfrei() {
        return glutenfrei;
    }

    /**
     *
     * @param glutenfrei
     */
    public void setGlutenfrei(boolean glutenfrei) {
        this.glutenfrei = glutenfrei;
    }

    /**
     *
     * @return
     */
    public boolean isLaktosefrei() {
        return laktosefrei;
    }

    /**
     *
     * @param laktosefrei
     */
    public void setLaktosefrei(boolean laktosefrei) {
        this.laktosefrei = laktosefrei;
    }

    /**
     *
     * @return
     */
    public boolean isZuckerfrei() {
        return zuckerfrei;
    }

    /**
     *
     * @param zuckerfrei
     */
    public void setZuckerfrei(boolean zuckerfrei) {
        this.zuckerfrei = zuckerfrei;
    }

    /**
     *
     * @return
     */
    public String[] getInhaltsstoffe() {
        return inhaltsstoffe;
    }

    /**
     *
     * @param inhaltsstoffe
     */
    public void setInhaltsstoffe(String[] inhaltsstoffe) {
        this.inhaltsstoffe = inhaltsstoffe;
    }

}