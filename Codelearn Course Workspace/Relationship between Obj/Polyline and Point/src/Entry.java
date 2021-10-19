public class Entry {
    public static void main(String[] args) {
        PolyLine polyline = new PolyLine();
        polyline.appendPoint(new Point(1, 1));
        polyline.appendPoint(new Point(2, 3));
        polyline.appendPoint(3, 0);
        polyline.appendPoint(4, 2);
        System.out.println(polyline.getLength());
    }
}
