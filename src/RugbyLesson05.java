public class RugbyLesson05 {
    public static void main(String[] args) {
        String TeamA = "Ireland";
        int[] teamAInt = new int[25];

        System.out.println("Вік гравців команди " + TeamA + ":");

        for (int index = 0; index < teamAInt.length; index++) {
            teamAInt[index] = (int) (18 + Math.random() * 23);
            System.out.print(teamAInt[index] + " ");
        }

        System.out.println();

        String TeamB = "France";
        int[] teamBInt = new int[25];

        System.out.println("Вік гравців команди " + TeamB + ":");

        for (int index = 0; index < teamBInt.length; index++) {
            teamBInt[index] = (int) (18 + Math.random() * 23);
            System.out.print(teamBInt[index] + " ");
        }

        System.out.println();
        System.out.println();


        int sumA = 0;
        for (int arrElement :
                teamAInt) {
            sumA += arrElement;
        }
        double avgA = (double) sumA / teamAInt.length;
        System.out.print("Середній вік команди " + TeamA + ": " + avgA);

        System.out.println();


        int sumB = 0;
        for (int arrElement :
                teamBInt) {
            sumB += arrElement;
        }
        double avgB = (double) sumB / teamBInt.length;
        System.out.print("Середній вік команди " + TeamB + ": " + avgB);
    }
}
