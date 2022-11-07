public class Main {
    
    public static int min(int a, int b, int c, int d) {
        if (min(a,b) < min(c, d)) return min(a, b);
        if (min(a,b) == min(c, d)) return min(a, b);
        return min(c, d);
    }

    public static int min(int a, int b) {
        if (a < b) return a;
        if (a==b) return a;
        return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
