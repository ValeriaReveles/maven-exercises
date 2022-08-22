package app;

import org.apache.commons.lang3.StringUtils;
import util.Input;

import static org.apache.commons.lang3.StringUtils.swapCase;


public class AppMain {
    public static void main(String[] args) {
        Input input = new Input();
        input.getString("Enter something: ");
        System.out.println(StringUtils.isNumeric(input.getString("Enter something: ")));
        System.out.println(StringUtils.reverse(input.getString("Enter something to reverse: ")));
        System.out.println(swapCase(input.getString("Enter something to swapCase: ")));
    }
}
