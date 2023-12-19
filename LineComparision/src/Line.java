public class Line {
    private int x1, y1, x2, y2;
    public double length;

    Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        this.length = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public boolean equals(Line obj) {
        if (this == obj) {
            return true;
        }

        return this.x1 == obj.x1 && this.y1 == obj.y1 && this.x2 == obj.x2 && this.y2 == obj.y2;
    }

    public int compareTo(Line otherLine) {

        return Double.compare(this.length, otherLine.length);
    }
}
