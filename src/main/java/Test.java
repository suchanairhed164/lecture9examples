public class Test implements Cloneable {
    Point p;
    int height;

    public Test(int x, int y, int z) {
        p=new Point(x, y);
        height=z;
    }

    public static void main(String s[]) {
        Test t1=new Test(1, 2, 3), t2=null;
        try {
            t2=(Test) t1.clone();
        } catch (CloneNotSupportedException e) {}
        t1.p.x=-1;
        t1.height=-1;
        System.out.println("t2.p.x=" + t2.p.x + ", t2.height=" + t2.height);
    }
}