package strings;

public class ShortestPath {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N') {
                y++; // North
            } else if (dir == 'S') {
                y--; // Spouth
            } else if (dir == 'E') {
                x++; // East
            } else {
                x--; // West
            }
        }
        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
