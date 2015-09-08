/**
 * Created by User on 08.09.2015.
 */

import java.io.*;
import java.util.Scanner;

public class Main {
    final static public String header = "\u0001{1:F21NADCRUMMAXXX0151000947}{4:{177:0210040855}{451:0}}{1:F01NADCRUMMAXXX0151000947}{2:O5641055110504IRVTUS3NXXXX06860016260210040855N}{4:";
    final static public String footer = "-}{5:{MAC:F2C46A24}{CHK:8B799F5909E2}{TNG:}}{S:{SAC:}{COP:P}}\u0003";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = null;

        System.out.println("Insert pass to your folder");
        input = scan.next();

        File swiftMes = new File (input);
        swiftMes.mkdirs();

        System.out.println("Insert file name");
        input = scan.next();

        try(FileWriter writer = new FileWriter(swiftMes+"\\"+input+".out", false))
        {
            writer.write(header);
            writer.append('\n');
            writer.write(footer);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}
