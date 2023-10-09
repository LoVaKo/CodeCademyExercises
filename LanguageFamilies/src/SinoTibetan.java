public class SinoTibetan extends Language {

    public SinoTibetan(String langName, int langNumSpeakers) {
        super(langName, langNumSpeakers, "Asia", "subject-order-verb");
        if (this.name.contains("Chinese")) {
            wordOrder = "subject-verb-order";
        }
    }
}
