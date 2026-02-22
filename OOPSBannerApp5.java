public class OOPSBannerApp5 {

    public static void main(String[] args) {

        String[] lines = new String[7];

        lines[0] = " *****    *****   ******    ****  ";
        lines[1] = "*     *  *     *  *     *  *     ";
        lines[2] = "*     *  *     *  *     *  *     ";
        lines[3] = "*     *  *     *  ******    ****  ";
        lines[4] = "*     *  *     *  *             *  ";
        lines[5] = "*     *  *     *  *             * ";
        lines[6] = " *****    *****   *         *****  ";

        // for-each loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}