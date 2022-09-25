package app;

import java.util.Date;
import java.util.List;

public interface IAppareil {
    public void enregister(Contact c);
    public void enregister(Appel appel, String numeroTel);
    public Contact consulter(int numero) throws Exception;
    public List<Contact> consulter(String mc);
    public double coutTotal();
    public double coutParDate(Date d1, Date d2);
    public double coutParAppel(int numeroContact);

}
