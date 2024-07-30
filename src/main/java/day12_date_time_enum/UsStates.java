package day12_date_time_enum;

public enum UsStates {

    /*
        Enum is a storage for constant values
     */
    ALABAMA("Alabama", "AL", "Montgomery"),
    ALASKA("Alaska", "AK", "Juneau"),
    Arizona("ARIZONA", "AZ", "Phoenix");

    private final String stateName;
    private final String abbreviation;
    private final String capitalCity;

    UsStates(String stateName,String abbreviation,String capitalCity){
        this.stateName = stateName;
        this.abbreviation =abbreviation;
        this.capitalCity = capitalCity;
    }

    public String getStateName(){
        return stateName;
    }

    public String getAbbreviation(){
        return abbreviation;
    }

    public String getCapitalCity(){
        return capitalCity;
    }


}
