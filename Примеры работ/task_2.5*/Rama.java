//  Мама моет рамы рекурсиями без циклов в классе Rama.java

public class Rama {
    public static int close = 0;
    public static String[] wds = new String[]{" 1-Мама", " 2-Мыла", " 3-Раму"};
    public static int len = wds.length;

    static void rekurs(int i, int j, int k ) {
        if (i < len) {
            if ((j < len)&&(close==0)) {
                if ((k < len)&&(close==0)) {
                    if ((i != j) && (j != k) && (i != k)) System.out.println(wds[i] + wds[j] + wds[k]);
                    k++;
                    if ((k < len)&&(close==0)) { rekurs(i, j, k);  }
                }
                j++; k=0;
                if ((j < len)&&(close==0)) { rekurs(i, j, k);  }
            }
            i++; j=0;
            if (i>=len)  close=1;
            if ((i<len)&&(close==0)) { rekurs(i, j, k); }
        }
    }

    public static void main(String[] args) {
        rekurs(0,0,0);
        }
}
