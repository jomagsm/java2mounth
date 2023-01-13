import java.util.ArrayList;
import java.util.Collections;

public class App {
        public static void main(String[] args) throws Exception {
                final String separator = "==========+++==========";
                ArrayList<String> colors = new ArrayList<>();
                ArrayList<Player> players = new ArrayList<>();

                colors.add("Red");
                colors.add("Green");
                colors.add("Black");
                colors.add("White");
                colors.add("Pink");
                colors.add("Yellow");
                System.out.println(colors);
                System.out.println(separator);
                Collections.sort(colors);
                System.out.println(colors);
                System.out.println(separator);
                Collections.reverse(colors);
                System.out.println(colors);
                System.out.println(separator);
                Collections.shuffle(colors);
                System.out.println(colors);
                System.out.println(separator);
                for (String item : colors) {
                        System.out.println(item);
                }

                Player player1 = new Player("Mack", 1);
                Player player2 = new Player("Jack", 7);
                Player player3 = new Player("Macle", 9);

                players.add(player1);
                players.add(player2);
                players.add(player3);
                System.out.println(players);
        }
}
