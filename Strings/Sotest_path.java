package Strings;

public class Sotest_path {
    public static void main(String args[]) {
        String Path = "WNEENESENNN";

        int x = 0;
        int y = 0;

        for (int i = 0; i < Path.length(); i++) {
            char dir = Path.charAt(i);

            if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else {
                y--;
            }

            
        }
        // Formula use to Find the Sortest path.
            int dir1 = x*x;
            int dir2 = y*y;
            System.out.println(Math.sqrt(dir1+dir2));
    }
}
