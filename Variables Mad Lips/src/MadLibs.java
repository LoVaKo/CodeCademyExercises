public class MadLibs {
    /*
    This program generates a madlipped story
    */
    public static void main(String[] args){

        //The input for the story
        String name1 = "Eragon";
        String name2 = "Ivan";
        String adjective1 = "warm";
        String adjective2 = "creamy";
        String adjective3 = "soft";
        String verb1 = "cycling";
        String noun1 = "helicopter";
        String noun2 = "e-reader";
        String noun3 = "hairbrush";
        String noun4 = "thermostat";
        String noun5 = "catflap";
        String noun6 = "cauldron";
        int number = 24 ;
        String place1 = "pasture";


        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
