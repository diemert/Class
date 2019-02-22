package app;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Roster {

    private ArrayList<String> names;

    private String title;

    public Roster(String title) {
        names = new ArrayList<String>();
        this.title = title;
    }

    public void addName() {
        Scanner s = new Scanner(System.in);
        System.out.println("What name would you like to add?");
        while (true) {
            boolean match = true;
            String name = s.nextLine();
            for (String word : names) {
                if (word.equals(name)) {
                    match = false;
                    System.out.println("That name already exists. Please try again.");
                    break;
                }
            }
            if (match) {
                names.add(name);
                break;
            }
        }
        sortNames();
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public String getTitle() {
        return title;
    }

    public void sortNames() {
        for (int x = 0; x < names.size(); x++) {
            int alpha = x;
            for (int y = x+1; y < names.size(); y++) {
                if (names.get(y).compareTo(names.get(alpha)) > 0) {
                    alpha = y;
                }
            }
            String temp = names.get(x);
            names.set(x, names.get(alpha));
            names.set(alpha, temp);
        }
    }
}