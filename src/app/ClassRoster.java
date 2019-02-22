package app;

import java.util.ArrayList;

public class ClassRoster extends Roster{

    public int maxSize;

    public ClassRoster(String title, int size) {
        super(title);
        this.maxSize = size;
    }

    @Override
    public void addName() {
        if (this.getNames().size() < maxSize) {
            super.addName();
        }
        else {
            System.out.println("Sorry, you have reached the maximum size for this class");
        }
    }

   @Override
    public void sortNames() {
        ArrayList<String> names = this.getNames();
		for (int x = 1; x < names.size(); x++) {
            for (int y = x-1; y >= 0; y--) {
                if (names.get(y).compareTo(names.get(y+1)) > 0) {
                    String temp = names.get(y);
                    names.set(y, names.get(y+1));
                    names.set(y+1, temp);
                }
            }
        }
    }

    public String coldCall() {
        return this.getNames().get((int)(Math.random() * this.getNames().size()));
    }

    public ArrayList<String> shuffleNames() {
        ArrayList<String> shuffledNames = new ArrayList<String>();
        for (String name : this.getNames()) {
            shuffledNames.add(name);
        }
        for (int x = shuffledNames.size() -1; x > 0; x--) {
            int r = (int)(Math.random() * x);
            String temp = shuffledNames.get(r);
            shuffledNames.set(r, shuffledNames.get(x));
            shuffledNames.set(x, temp);
        }
        return shuffledNames;
    }

    public String[][] randomGroups (int groupCount) {
        String[][] groups;
        if (groupCount > 0 && groupCount < getNames().size()) {
            ArrayList<String> shuffled = shuffleNames();
            int groupSize = shuffled.size()/groupCount;
            if (shuffled.size() % groupCount > 0) groupSize++;
            groups = new String[groupCount][groupSize];
            int x = 0;
            while (x < shuffled.size()) {
                for (int row = 0; row < groupCount; row++) {
                    for (int col = 0; col < groupSize && x < shuffled.size(); col++) {
                        groups[row][col] = shuffled.get(x);
                        x++;
                    }
                }
            }
        }
        else {
            groups = new String[1][1];
            System.out.println("\nGive a reasonable number of groups");
        }
        return groups;
    }

}