import java.util.*;
public class Snake_Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int position = 1;
        Random rand = new Random();

        while (position != 100) {

            int dice = rand.nextInt(6)+1;
            if (position + dice <= 100) {
                position = position + dice;
                System.out.println("Dice :" + dice);
                System.out.println("Position :" + position);
                System.out.println("");

                switch (position) {
                    case 4:
                        position = position + 10;
                        System.out.println("Climbed Ladder.");
                        System.out.println("");
                        break;
                    case 9:
                        position = position + 22;
                        System.out.println("Climbed Ladder.");
                        System.out.println("");
                        break;
                    case 20:
                        position = position + 18;
                        System.out.println("Climbed Ladder.");
                        System.out.println("");
                        break;
                    case 29:
                        position = position + 55;
                        System.out.println("Climbed Ladder.");
                        System.out.println("");
                        break;
                    case 40:
                        position = position + 19;
                        System.out.println("Climbed Ladder.");
                        System.out.println("");
                        break;
                    case 63:
                        position = position + 18;
                        System.out.println("Climbed Ladder.");
                        System.out.println("");
                        break;
                    case 71:
                        position = position + 20;
                        System.out.println("Climbed Ladder.");
                        System.out.println("");
                        break;
                    case 99:
                        position = position - 53;
                        System.out.println("Snake Bite.");
                        System.out.println("");
                        break;
                    case 93:
                        position = position - 20;
                        System.out.println("Snake Bite.");
                        System.out.println("");
                        break;
                    case 87:
                        position = position - 63;
                        System.out.println("Snake Bite.");
                        System.out.println("");
                        break;
                }
            }
        }
    }
}
