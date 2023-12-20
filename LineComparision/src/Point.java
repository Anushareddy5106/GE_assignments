//UC7
public class Point {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point obj) {
        if (this == obj) {
            return true;
        }

        return this.x == obj.x && this.y == obj.y;
    }

}
