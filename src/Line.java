public class Line {
    private final int k;
    private final int b;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        Point intersection;
        if (this.k == other.k)  intersection = null;
        else {
            int x = (other.b - this.b) / (this.k - other.k);
            int y = this.k * x + this.b;
            intersection = new Point(x, y);
        }
        System.out.println(this.equals(other));
        return intersection;
    }

}