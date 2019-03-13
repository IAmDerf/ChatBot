public enum FUNKTION {
    EMNESKIFT ("btw","forresten"),
    AFLEVERING ("?","kan") ,
    FASTHOLDELSE,
    FEEDBACK ("lol","cool","sejt"),
    LUKNING ("nå","farvel"),
    OVERTAGELSE (),
    ÅBNING("hej","hallo","halløj","hejsa","hi","yo","hvad","hvor","hvornår","hvem","nå");

    private final String [] keywords;

    FUNKTION(String... key) {
        keywords = key;

    }

    public String[] getKeywords() {
        return keywords;
    }
}

