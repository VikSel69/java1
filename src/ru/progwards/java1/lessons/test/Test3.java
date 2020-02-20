package ru.progwards.java1.lessons.test;

class Point2D {
    private int x, y;

    public Point2D (int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return (this.x + "," + this.y);
    }

    public static void main(String[] args) {
        Point2D point = new Point2D(23, 12);
        System.out.println(point.toString());
    }
}

class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    @Override
    public String toString() {
        return super.toString() + "," + this.z;
    }
    public static void main(String[] args) {
        Point3D point = new Point3D(23, 12, 37);
        System.out.println(point.toString());
    }

}