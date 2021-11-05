class Point {
    static int x;
    static int y;

    public Point(int x, int y) {
    }
}


public class Arrays {
    public static void main(String[] args){
        /*
        Point p[]=new Point[5];
        for (int i=0; i<p.length; i++) {
            System.out.println(p[i]);
        }

        // результат работы метода toString()
        System.out.println(new int[3]);
        System.out.println(new int[3][5]);
        System.out.println(new String[2]);

        // результат работы метода hashCode()
        System.out.println(new float[2].hashCode());

         */
        int a[][]={{1, 2}, {3}};
        int b[][]=(int[][]) a.clone();
        int var=0;

        /*
        if (var==0) {
            // первый вариант:
            a[0]=new int[]{0};
            System.out.println(b[0][0]);
        } else {
            // второй вариант:
            a[0][0]=0;
            System.out.println(b[0][0]);
        }

         */
        if (var==0) {
            // первый вариант:
            a[0]=new int[]{0};
            System.out.println(b[0][0]);
        } else {
            // второй вариант:
            a[0][0]=0;
            System.out.println(b[0][0]);
        }


    }
}
