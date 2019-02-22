package app;

public class RosterTester {
    
    public static void main (String[] args) {
        // create a roster with a max size of 16
        ClassRoster myClass = new ClassRoster("Math Class", 16);
        
        // add names to the roster 
        // attempt to add more than maxSize names
        for (int x = 0; x < 17; x++) {
            myClass.addName();
        }

        // show the names were sorted alphabetically
        System.out.println("\nAphlabetically sorted: " + myClass.getNames());

        // randomize the list of names
        System.out.println("\nSuffled names: " + myClass.shuffleNames());

        // select a random name
        System.out.println("\nCold Call: " + myClass.coldCall());

        // split the roster into two groups
        System.out.print("\nGroups of 2:");
        for (String[] groups : myClass.randomGroups(2)) {
            System.out.print("\nGroup: ");
            for (int x = 0; x < groups.length-1; x++) {
                System.out.print(groups[x] + ", ");
            }
            System.out.print(groups[groups.length-1]);
        }
        System.out.println();

        // split the roster into three groups
        System.out.print("\nGroups of 3:");
        for (String[] groups : myClass.randomGroups(3)) {
            System.out.print("\nGroup: ");
            for (int x = 0; x < groups.length-1; x++) {
                System.out.print(groups[x] + ", ");
            }
            System.out.print(groups[groups.length-1]);
        }
        System.out.println();

        // split the roster into four groups
        System.out.print("\nGroups of 4:");
        for (String[] groups : myClass.randomGroups(4)) {
            System.out.print("\nGroup: ");
            for (int x = 0; x < groups.length-1; x++) {
                System.out.print(groups[x] + ", ");
            }
            System.out.print(groups[groups.length-1]);
        }

        // attempt to split the roster into zero groups
        System.out.print("\n\nGroups of 0:");
        for (String[] groups : myClass.randomGroups(0)) {
            System.out.print("Group: ");
            for (int x = 0; x < groups.length-1; x++) {
                System.out.print(groups[x] + ", ");
            }
            System.out.print(groups[groups.length-1]);
        }
        System.out.println();
    }
}