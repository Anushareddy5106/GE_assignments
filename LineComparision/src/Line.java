//UC7
public class Line {
    private Point point1;
    private Point point2;
    public double length;

    Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;

        this.length = Math
                .sqrt((point1.x - point2.x) * (point1.x - point2.x) + (point1.y - point2.y) * (point1.y - point2.y));
    }

    public boolean equals(Line obj) {
        if (this == obj) {
            return true;
        }

        return this.point1.equals(obj.point1) && this.point2.equals(obj.point2);
    }

    public int compareTo(Line otherLine) {

        return Double.compare(this.length, otherLine.length);
    }
}
