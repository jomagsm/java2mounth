import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
                ArrayList<String> listA = new ArrayList<String>();
                ArrayList<String> listB = new ArrayList<String>();
                ArrayList<String> listC = new ArrayList<String>();
                listA = getListOfNames();
                printSeparator(listA);
                listB = getListOfNames();
                printSeparator(listB);
                listC = mergeLists(listA, listB);
                printSeparator(listC);
                Collections.sort(listC, Comparator.comparing(String::length));
                printSeparator(listC);
                ;
        }

        public static ArrayList<String> getListOfNames() {
                ArrayList<String> temp = new ArrayList<String>();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input name: ");
                for (int i = 0; i < 5; i++) {
                        temp.add(scanner.next());
                }
                return temp;
        }

        public static ArrayList<String> mergeLists(ArrayList<String> first, ArrayList<String> second) {
                ArrayList<String> temp = new ArrayList<String>();
                Collections.reverse(second);
                if (first.size() == second.size()) {
                        for (int i = 0; i < first.size(); i++) {
                                temp.add(first.get(i));
                                temp.add(second.get(i));
                        }
                }
                return temp;
        }

        public static void printSeparator(ArrayList<String> first) {
                final String separator = "==========+++==========";
                System.out.println(first);
                System.out.println(separator);
        }
}
