/*
Languages, just like people, often have families. You can even map language lineage a bit like a family tree.

Java can help us build a model to track inherited traits across families.
In this case, we’ll focus on something that often varies between language families: word order
— where the subject, verb, and object would go in a sentence.

Your LanguageFamilies package has three Java files:

Language.java: for the Language parent class, which serves as the template for all languages.
Mayan.java: for Mayan, a child class of Language modeled after the Mayan language family.
SinoTibetan.java: for SinoTibetan, a child class of Language modeled after the Sino-Tibetan language family.

Build out a Java package with these classes to model real-world language families.
 */


public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String langName, int langNumSpeakers, String langRegionsSpoken, String langWordOrder) {
        this.name = langName;
        this.numSpeakers = langNumSpeakers;
        this.regionsSpoken = langRegionsSpoken;
        this.wordOrder = langWordOrder;
    }

    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
    }

    public static void main(String[] args) {
        Language Dutch = new Language("Dutch", 25000000, "The Netherlands, Belgium, Suriname, Aruba, Curacao and Sint Maarten, Sint Eustatius, Saba and Bonaire", "subject, verb, object");
        Dutch.getInfo();

        Mayan Chontal = new Mayan("Chontal", 60563);
        Chontal.getInfo();

        SinoTibetan mandarinChinese = new SinoTibetan("Mandarin Chinese", 920000000);
        mandarinChinese.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
        burmese.getInfo();

    }
}

