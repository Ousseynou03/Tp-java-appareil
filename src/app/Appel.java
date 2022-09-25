package app;


import java.util.Date;

public abstract class Appel {
    protected int numeroAppel;
    protected Date dateAppel;
    protected double duree ;

    public int getNumeroAppel() {
        return numeroAppel;
    }

    public void setNumeroAppel(int numeroAppel) {
        this.numeroAppel = numeroAppel;
    }

    public Date getDateAppel() {
        return dateAppel;
    }

    public void setDateAppel(Date dateAppel) {
        this.dateAppel = dateAppel;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public Appel(int numeroAppel, Date dateAppel, double duree) {
        this.numeroAppel = numeroAppel;
        this.dateAppel = dateAppel;
        this.duree = duree;
    }

    public Appel() {
    }
    public abstract double cout();
}
