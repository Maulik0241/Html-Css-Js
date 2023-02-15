package Program1;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player player1, Player player2) {
        // First, compare by skill
        int skillComparison = player1.getSkill().compareTo(player2.getSkill());
        if (skillComparison != 0) {
            return skillComparison;
        }
        // If the skills are the same, compare by name
        return player1.getName().compareTo(player2.getName());
    }
}
