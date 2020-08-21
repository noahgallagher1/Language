public class SinoTibetan extends lang{
    SinoTibetan(String langName, int speakers){
        super(langName, speakers, "Asia","subject-object-verb");
        if (langName.equals("Chinese")){
            this.wordOrder = "subject-verb-object";
        }
    }


}
