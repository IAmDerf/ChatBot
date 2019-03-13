import java.util.*;

public class Query {

    private String text;
    private ArrayList<String> keywords;
    private static ArrayList<String> bannedWords;
    private boolean spørgsmål;
    private FUNKTION funktion;


    public Query(String input){
        keywords=new ArrayList<>();
        text=input;
        spørgsmål = input.contains("?");
        for (String ord: input.split("\\b")) {
            boolean erKeyword = true;
            for(String bannedwords: bannedWords){
                if(ord.toLowerCase().matches(bannedwords)){
                    erKeyword=false;
                }
            }
            if(erKeyword){
                keywords.add(ord.toLowerCase());
            }
        }
        funktion = null;
        for (FUNKTION value : FUNKTION.values()) {
            for(String funkKey : value.getKeywords()){
                if(keywords.contains(funkKey)){
                    funktion = value;
                }
            }
        }
        if(funktion == null){
            System.out.println("funktion kunne ikke findes");
        }


    }

    public static void setBannedWords(){
        String[] words = {"det","den","der","og","er","en","et"," ",",",", "};
        bannedWords= new ArrayList<>(Arrays.asList(words));

    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public boolean isSpørgsmål() {
        return spørgsmål;
    }

    public String getText() {
        return text;
    }

    public String getSvar(){
        return null;
    }

    public FUNKTION getFunktion() {
        return funktion;
    }
}
