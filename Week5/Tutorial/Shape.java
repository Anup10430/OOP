package Tutorial;

abstract class Shape {
    abstract void getRectangleArea(int l, int b);
    abstract void getSquareArea(int l);
    abstract void getCircleArea(int r);
}

class Area extends Shape {
    @Override
    void getRectangleArea(int l, int b) {
        System.out.println(l * b);
    }

    @Override
    void getSquareArea(int l) {
        System.out.println(l * l);
    }

    @Override
    void getCircleArea(int r) {
        System.out.println(3.14 * r * r);
    }
}