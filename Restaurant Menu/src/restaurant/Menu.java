package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> currentMenu = new ArrayList<>();


    public ArrayList<MenuItem> getCurrentMenu() {
        return currentMenu;
    }

    public void setCurrentMenu(ArrayList<MenuItem> currentMenu) {
        this.currentMenu = currentMenu;
    }
}
