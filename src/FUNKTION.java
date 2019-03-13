public enum FUNKTION {
    AFLEVERING ,
    EMNESKIFT ("btw","forresten"),
    FASTHOLDELSE,
    FEEDBACK ("lol","cool","sejt"),
    LUKNING,
    OVERTAGELSE,
    ÅBNING("hej","hallo","halløj","hejsa","hi","yo","hvad","hvor","hvornår","hvem");

    private final String [] keywords;

    FUNKTION(String... key) {
        keywords = key;

    }

    public String[] getKeywords() {
        return keywords;
    }
}

