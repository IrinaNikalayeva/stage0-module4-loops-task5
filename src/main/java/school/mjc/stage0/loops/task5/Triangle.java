package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int counter = 1;
        while (counter <= cathetusLength) {
            for (int i = 1; i <= counter; i++) {
                System.out.print("8");
            }
            System.out.println();
            counter++;
        }
    }
}
