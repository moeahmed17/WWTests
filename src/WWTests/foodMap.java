package WWTests;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by moe on 12/11/2017.
 */

// General Scripting/Logic
// Answer for question 2a and 2b

   /* a)	Display the third and fifth item from the above list. Your output should be:
            Applesauce, unsweetened
            Juice, Cranberry-apple drink

            driver.findELements(By.className(“title ng-binding”)).get(2).getText();
            driver.findELements(By.className(“title ng-binding”)).get(4).getText():
*/

public class foodMap {

    public static void main(String [] args){

        Map<String, String> map = new HashMap<String, String>();
        map.put("Apple butter", "1 Tbsp");
        map.put("Apple(s) fresh", "1 medium");
        map.put("Applesauce, unsweetened ", "1/2 cup(s)");
        map.put("Apple(s), dried", "1/4 cup(s)");
        map.put("Juice, Cranberry-apple drink", "8 fl oz");


        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Food Name : " + entry.getKey());
            System.out.println(" Servings : " + entry.getValue());
        }
    }
}
