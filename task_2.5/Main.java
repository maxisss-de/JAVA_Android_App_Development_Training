public class Main {
    
    public static void main(String[] args) {
        String[] proverb = new String[]{"Мама", "Мыла", "Раму"};
        int www = proverb.length;
        for (int i = 0; i < www; i++) {
            for (int j = 0; j < www; j++) {
                for (int k = 0; k < www; k++) {
                    if ((i != j) && (j != k) && (i != k)) System.out.println(proverb[i] + proverb[j] + proverb[k]);
                }
            }
        }
    }
}
