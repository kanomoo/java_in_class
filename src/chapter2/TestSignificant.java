package chapter2;
// การแปลงข้อมูล ความสำคับต่ำกว่าทำให้ข้อมูลสูญหาย
public class TestSignificant {
    public static void main(String[] args) {
        float a = 1.0f, b = 2.5f;
        int c;
        double d;
        d = a + b;
        System.out.println("d = " + d);
        c = (int) (a + b);
        System.out.println("c = " + c);
    }
}
