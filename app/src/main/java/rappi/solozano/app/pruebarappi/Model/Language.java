package rappi.solozano.app.pruebarappi.Model;

public class Language {

    private String ID;
    private String english_name;
    private String original_name;

    public Language(String ID, String english_name, String original_name) {
        this.ID = ID;
        this.english_name = english_name;
        this.original_name = original_name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEnglish_name() {
        return english_name;
    }

    public void setEnglish_name(String english_name) {
        this.english_name = english_name;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }
}
