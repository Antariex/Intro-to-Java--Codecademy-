public class MadLibs {

    /*
    This program generates a mad libbed story.
    Author: Ariel
    Date: 12/09/2024
    */

    public static void main(String[] args){

        String name1 = "Oliver";
        String adjective1 = "brave";
        String adjective2 = "good";
        String adjective3 = "happy";
        String verb1 = "get loud";
        String noun1 = "cat";
        String noun2 = "fishes";
        String noun3 = "music";
        String noun4 = "dog";
        String noun5 = "milk";
        String noun6 = "idea";
        String name2 = "Tony";
        int number = 25;
        String place1 = "Buenos Aires";

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);

        //This story has no sense!
    }
}
