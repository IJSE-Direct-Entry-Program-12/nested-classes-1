public class AppInitializer {

    public static void main(String[] args) {
        G g1 = (x, y) -> x * x + 2 * x + y * y;
        G g2 = (x, y) -> 2 * x + 2 * y + 3;
        G g3 = (x, y) -> 2 * x * x + 3 + 4 * y * y;

        System.out.println(g2.execute(10,20));
    }
}

interface G {
    int execute(int x, int y);
}
