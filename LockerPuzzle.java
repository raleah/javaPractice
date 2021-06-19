import java.lang.Math;

public class LockerPuzzle {
    public static void main(String[] args) {
        /*boolean true/false
        true= open locker
        false= closed locker
        all lockers start false/closed
        */
        //set array for 100 lockers
        boolean[] lockers = new boolean[101];

        /*loop +1 per iteration +nth locker closed per iteration
            3rd student, every 3rd; 7th student, every 7th; etc. so
            100 % n == 0, lockers student open, all start closed (0),
            so any even number will set back to original state (0) since toggle 0/1
            2 flips: 0 1 0
            3 flips: 0 1 0 1
            looking for lockers # with odd number of divisors, perfect squares
            looking for perfect squares <= 100, those will be open*/

        // check if number is perfect square, if yes, change bool to true in array
        for (int i = 1; i <= 100; i++) {
            //checks if ceil and floor of sqrt i are equal to determine perfect square
            if (Math.ceil((double) Math.sqrt(i)) == Math.floor((double) Math.sqrt(i))) {
                lockers[i] = true;
            } //else not needed to simplify
        }

        //print array
        for (int i = 1; i < lockers.length; i++) {
            System.out.println("Locker " + i + " is " + (lockers[i] ? "open" : "closed"));

        }
    }
}