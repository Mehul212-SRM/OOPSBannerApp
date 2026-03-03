public class OOPSBannerApp6 {
    public static void main(String[] args) {
        String[] lines = {
            String.join(" ", "  *****  ", "  *****   ", "******** ", " ********"),
            String.join(" ", " **   ** ", " **   ** ", " **     **", "**       "),
            String.join(" ", "**     **", "**     **", " **     **", "**       "),
            String.join(" ", "**     **", "**     **", " ********", "  ********"),
            String.join(" ", "**     **", "**     **", " **      ", "         **"),
            String.join(" ", " **   ** ", " **   ** ", " **      ", "         **"),
            String.join(" ", "  *****  ", "  *****  ", " **      ", "  ********")
        };

        // Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}