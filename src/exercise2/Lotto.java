package exercise2;

import javax.swing.JOptionPane;
import java.util.Random;

public class Lotto {
    private int[] lottoNumbers = new int[3];

    public Lotto() {
        Random rand = new Random();
        for(int i=0; i<lottoNumbers.length; i++) {
            lottoNumbers[i] = rand.nextInt(9) + 1;
        }
    }

    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    public int getSum() {
        int sum = 0;
        for (int num : lottoNumbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number between 3 and 27:");
        int userNumber = Integer.parseInt(input);

        boolean won = false;
        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int sum = lotto.getSum();
            if (sum == userNumber) {
                won = true;
                break;
            }
        }

        if (won) {
            JOptionPane.showMessageDialog(null, "Congratulations! You won the lotto game.");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry! The computer won the lotto game.");
        }
    }
}