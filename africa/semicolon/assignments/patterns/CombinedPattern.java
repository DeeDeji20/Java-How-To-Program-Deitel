package patterns;

public class CombinedPattern {
    public static void main(String[] args) {
        System.out.println("1               1 2 3 4 5 6         1      1 2 3 4 5 6");
        System.out.println("1 2             1 2 3 4 5         2 1        1 2 3 4 5");
        System.out.println("1 2 3           1 2 3 4         3 2 1          1 2 3 4");
        System.out.println("1 2 3 4         1 2 3         4 3 2 1            1 2 3");
        System.out.println("1 2 3 4 5       1 2         5 4 3 2 1              1 2");
        System.out.println("1 2 3 4 5 6     1         6 5 4 3 2 1                1");
    }
    }