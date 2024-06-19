package quete06;

public class Wilder {

    // attributs
    private String firstname;
    private boolean aware;

    // constructeur
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // getteurs et setteurs
    public String getFirstname() {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // méthodes

    public String whoAmI() {
        if (this.getAware() == true) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        } else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
    }

}
