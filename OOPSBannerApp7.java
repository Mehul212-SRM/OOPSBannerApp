public class OOPSBannerApp7 {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        };

        String[] pPattern = {
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        };

        String[] sPattern = {
                " ******  ",
                "**       ",
                "**       ",
                " ******  ",
                "      ** ",
                "      ** ",
                " ******  "
        };

        String[] spacePattern = {
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          "
        };

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', oPattern);
        charMaps[1] = new CharacterPatternMap('P', pPattern);
        charMaps[2] = new CharacterPatternMap('S', sPattern);
        charMaps[3] = new CharacterPatternMap(' ', spacePattern);

        return charMaps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }


        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 7;

        for (int line = 0; line < height; line++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);

                System.out.print(pattern[line] + "  ");
            }

            System.out.println();
        }
    }

 
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}