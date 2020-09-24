// ================  МАМА-МЫЛА-РАМУ в ОДИН ЦИКЛ ===============================
public class Main {
    public static void main(String[] args) {
        String[] wds = new String[]{" 1-Мама", " 2-Мыла", " 3-Андроид"};
        int len = wds.length;
//======================== один цикл ===========================================
        for (int i=0 , j=0, k=0, r=0; ((i+j+k)<(len*len)); r++){
            k=r%len+1;
            j=(int) (r/len+1) - 3*((int)(r/(len*len))) ; //if (j>3) j-=3; = r/3
            i=(int) (r/(len*len)+1);
            //System.out.println(" Итерация i = " + i +" j = "+ j+" k = "+ k +" r = "+r);
            if ((i!=j)&&(j!=k)&&(i!=k)) System.out.println(wds[i-1] +" " + wds[j-1] +" "+ wds[k-1]);;
        }
    }
}
//====================================== КОНЕЦ ПРОГРАММЫ ==========================
