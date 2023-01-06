import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menus = {"Espresso", "Iced Coffee", "Macchiato"};
        menus[2] = "Latte";
        System.out.println(Arrays.toString(menus));

        String[] newMenu = new String[5];

        for (int i = 0; i < menus.length; i++) {
            newMenu[i] = menus[i];
        }

        System.out.println(Arrays.toString(newMenu));

        newMenu[3] = "House blend";
        newMenu[4] = "Dark roast";

        System.out.println(Arrays.toString(newMenu));
    }    
}
