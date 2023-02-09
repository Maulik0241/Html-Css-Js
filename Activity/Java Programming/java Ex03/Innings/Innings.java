public class Innings {
    private String teamname;
    private String inningsname;
    private int runs;
    public Innings(String teamname, String inningsname, int runs) {
        this.teamname = teamname;
        this.inningsname = inningsname;
        this.runs = runs;
    }
    public String getTeamname() {
        return teamname;
    }
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
    public String getInningsname() {
        return inningsname;
    }
    public void setInningsname(String inningsname) {
        this.inningsname = inningsname;
    }
    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }

    
}