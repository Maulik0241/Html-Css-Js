package CricketTeam;



class Player {
    String name;
    String dob;
    String skill;
    int numMatches;
    int runs;
    int wickets;
    String nationality;
    double rating;
    
    public Player(String name, String dob, String skill, int numMatches, int runs, int wickets, String nationality, double rating) {
        this.name = name;
        this.dob = dob;
        this.skill = skill;
        this.numMatches = numMatches;
        this.runs = runs;
        this.wickets = wickets;
        this.nationality = nationality;
        this.rating = rating;
    }
    
    public String toString() {
        return name + " " + dob + " " + skill + " " + numMatches + " " + runs + " " + wickets + " " + nationality + " " + rating;
    }
}

