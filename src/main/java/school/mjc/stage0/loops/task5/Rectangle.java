package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= length; j++) {

                if ((i > 1 && j > 1) && (i < height && j < length)) {
                    System.out.print(" ");
                } else
                    System.out.print("8");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.printRectangleFrom8s(6, 3);
    }
}
