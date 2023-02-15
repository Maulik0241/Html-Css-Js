package HashMapPlayer;

import java.util.*;

class Player {
    private String bowlerName;
    private int wicketCount;

    public Player(String name, int wickets) {
        this.bowlerName = name;
        this.wicketCount = wickets;
    }

    public String getBowlerName() {
        return this.bowlerName;
    }

    public void setBowlerName(String name) {
        this.bowlerName = name;
    }

    public int getWicketCount() {
        return this.wicketCount;
    }

    public void setWicketCount(int wickets) {
        this.wicketCount = wickets;
    }
}

