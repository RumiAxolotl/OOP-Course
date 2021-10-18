public class Entry {
    public static void main(String[] args) {
        // cách 1 nhập thông qua biến begin và end của lớp Point
        Point begin = new Point(1,1);
        Point end = new Point(2,2);
        Line line1 = new Line(begin, end);
        System.out.println(line1.getLength()); //xuất khoảng cách của 2 điểm begin và end

        // cách 2 là nhập trực tiếp thông qua lớp Line
        Line line2 = new Line(2, 3, 5, 4);
        System.out.println(line2.getLength());
    }
}
