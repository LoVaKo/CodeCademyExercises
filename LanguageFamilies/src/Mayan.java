public class Mayan extends Language {

    public Mayan(String langName, int langNumSpeakers) {
        super(langName, langNumSpeakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
        System.out.println("Fun Fact: " + name + " is an ergative language.");
    }

}