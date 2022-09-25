import app.Appareil;
import app.Contact;
import app.IAppareil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        IAppareil appareil = new Appareil();
        appareil.enregister(new Contact(1,"Weuz","0705443903"));





    }
}