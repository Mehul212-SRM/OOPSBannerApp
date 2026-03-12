import java.util.HashMap;

public class OOPSBannerApp8 {

    // Function to render banner
    public static void renderBanner(String word, HashMap<Character, String[]> map) {

        int rows = map.get(word.charAt(0)).length;

        for (int i = 0; i < rows; i++) {
            for (char c : word.toCharArray()) {

                String[] pattern = map.get(c);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charPatternMap = new HashMap<>();

        // Pattern for O
        charPatternMap.put('O', new String[]{
                "   ***    ",
                " **   **  ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                " **   **  ",
                "   ***    "
        });

        // Pattern for P
        charPatternMap.put('P', new String[]{
                "******   ",
                "**   **  ",
                "**    ** ",
                "**   **  ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "

        });

        // Pattern for S
        charPatternMap.put('S', new String[]{
                "  *****  ",
                " **      ",
                "**       ",
                " **      ",
                "   ***   ",
                "      ** ",
                "       **",
                "      ** ",
                " *****   "
        });

        String bannerWord = "OOPS";

        renderBanner(bannerWord, charPatternMap);
    }
}