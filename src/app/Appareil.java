package app;

import java.util.*;

public class Appareil implements IAppareil{
    private List<Contact> contacts = new ArrayList<Contact>();
    private Map<Integer, Appel> appel = new HashMap<Integer, Appel>();

    @Override
    public void enregister(Contact c) {
        //Enregistrement d'un nouveau contact
        contacts.add(c);

    }

    @Override
    public void enregister(Appel appel, String numeroTel) {
        //Enregistrer un appel sachant le numéro de téléphone
        Contact c1 = null;
        for (Contact c : contacts) {
            if (c.getNumeroTel().equals(numeroTel)){
                c1 = c;
                break;
            }
        }

    }

    @Override
    public Contact consulter(int numero) {
        return null;
    }

    @Override
    public List<Contact> consulter(String mc) {
        return null;
    }

    @Override
    public double coutTotal() {
        return 0;
    }

    @Override
    public double coutParDate(Date d1, Date d2) {
        return 0;
    }

    @Override
    public double coutParAppel(int numeroContact) {
        return 0;
    }
}
