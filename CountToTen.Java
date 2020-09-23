public class CountToTen {
    public static void main(String[] args) {
        //System.out.println("'1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10'");
        System.out.print("'");
        for (int i = 1; i <= 10; i++) {
            if (i < 9) {
                System.out.print(i + ", ");
            } else if (i == 9) {
                System.out.print(i + " ou ");
            } else {
                System.out.print(i);
            }

        }
        System.out.print("'");
    }
}