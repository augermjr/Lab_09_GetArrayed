import java.util.Scanner;
public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);
        return retString;
    }
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        String trash = "";
        do {
            trash = "";
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
            }
            else {
                trash = pipe.nextLine();
                System.out.print("Invalid input. Try again.\n");
            }
        } while(trash.length() != 0);
        return retInt;
        }
    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0;
        String trash = "";
        do {
            trash = "";
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
            }
            else {
                trash = pipe.nextLine();
                System.out.print("Invalid input. Try again.\n");
            }
        } while(trash.length() != 0);
        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        String trash = "";
        do {
            trash = "";
            System.out.print("\n" + prompt + " [" + low + "--" + high + "]: " );
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                if (retInt <= high && retInt >= low){
                    return retInt;
                }
                else {
                    trash = pipe.nextLine();
                    System.out.print("Invalid input. Try again.");
                    pipe.nextLine();
                }
            }
        } while(trash.length() != 0);
        return retInt;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble = 0;
        String trash = "";
        do {
            trash = "";
            System.out.print("\n" + prompt + " [" + low + "--" + high + "]: " );
            if (pipe.hasNextInt()) {
                retDouble = pipe.nextInt();
                if (retDouble <= high && retDouble >= low){
                    return retDouble;
                }
                else {
                    trash = pipe.nextLine();
                    System.out.print("Invalid input. Try again.");
                    pipe.nextLine();
                }
            }
        } while(trash.length() != 0);
        return retDouble;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        String trash = "";
        boolean out = false;
        do {
            trash = "";
            System.out.print("\n" + prompt + "[Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                out = true;
            }
            else if (response.equalsIgnoreCase("N")){
                out = false;
            }
            else {
                System.out.print("Invalid input. Try again.\n");
            }
        } while(!response.equalsIgnoreCase("Y") || !response.equalsIgnoreCase("N"));
        return out;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regExStr) {
        String response = "";
        do {
            System.out.print("\n" + prompt + ": ");
            if (response.matches(regExStr)) {
                response = pipe.nextLine();
            }
        } while(response.matches(null) || !response.matches(regExStr));
        return response;
    }
}

