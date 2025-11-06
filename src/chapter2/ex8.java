package chapter2;

public class ex8 {
    public static void main(String[] args) {
        boolean result = false;
        int number = 5;
        String color ="red";
        // String color = new String("red"); // ตำแหน่งในหน่วยความจำเป็น object ไม่ใช่ String เพราะ สร้าง object ใหม่
        
        System.out.println("When number = " + number + ", color = " + color);
        result = (number < 10) && (color == "red");
        System.out.print("result = (number < 10 ) && (color == \"red\") = ");
        System.out.println(result);
        result = (number < 10) & (color == "red");
        System.out.print("result = (number < 10) & (color == \"red\") = ");
        System.out.println(result);
        result = (number < 10) || (color == "red");
        System.out.print("result = (number < 10) || (color == \"red\") = ");
        System.out.println(result);
        result = (number < 10) | (color == "red");
        System.out.print("result = (number < 10) | (color == \"red\") = ");
        System.out.println(result);
        result = (number < 10) ^ (color == "red"); // จริง ถ้าต่างกัน เท็จ ถ้าเหมือนกัน
        System.out.print("result = (number < 10) ^ (color == \"red\") = ");
        System.out.println(result);
        result = !(number < 10);
        System.out.println("result = !(number < 10) = " + result);
        result = !(color == "red");
        System.out.println("result = !(color == \"red\") = " + result);
    }
}
