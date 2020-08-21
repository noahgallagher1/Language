public class lang {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public lang(String langName, int speakers, String regions, String wdOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
    }

    public static void main(String[] args){
        //Language english = new Language("English",10,"Europe","sub, verb, noun");
        //english.getInfo();
        Mayan kiche = new Mayan("Kiche",2000);
        kiche.getInfo();
        //lang tibet = new SinoTibetan("Chinese",50);
        //tibet.getInfo();

    }


}
