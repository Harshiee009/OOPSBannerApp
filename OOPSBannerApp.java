public class OOPSBannerApp {
    public static void main(String[] args) {
        System.out.println("OOPS Banner App - UC5");

        // Inline array initialization with String.join()
        String[] banner = {
            String.join("", "  *****  ", "  ", "  *****  ", "  ", "****** ", "  ", " *****  "),
            String.join("", "**     **", "  ", "**     **", "  ", "**   **", "  ", "**      "),
            String.join("", "**     **", "  ", "**     **", "  ", "**   **", "  ", "**      "),
            String.join("", "**     **", "  ", "**     **", "  ", "****** ", "  ", " *****  "),
            String.join("", "**     **", "  ", "**     **", "  ", "**     ", "  ", "     ** "),
            String.join("", "**     **", "  ", "**     **", "  ", "**     ", "  ", "     ** "),
            String.join("", "  *****  ", "  ", "  *****  ", "  ", "**     ", "  ", "******  ")
        };

        // Enhanced for loop for clean output
        for (String line : banner) {
            System.out.println(line);
        }
    }
}