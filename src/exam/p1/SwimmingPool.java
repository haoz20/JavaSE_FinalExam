package exam.p1;


public class SwimmingPool {

    public static void main(String[] args) {
        int l = 20;
        int w = 15;
        int area = 552;

        System.out.println(calculateX(l, w, area));

    }

    public static float calculateX(int l, int w, int area) {
        double a = 4;
        double b = (l * 2) + (w * 2);
        double c = (l * w) - area;
        double calculation = Math.sqrt((b*b) - (4 * a * c));
        float x1 = (float) (((-1*b) + calculation) / (2*a));
        float x2 = (float) (((-1*b) - calculation) / (2*a));
        if (x1 < 0) {
            return x2;
        }
        if (x2 < 0) {
            return x1;
        }
        return 0;
    }

}
