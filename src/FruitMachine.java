import java.util.ArrayList;
import java.util.Random;

public class FruitMachine {

    public static int genarateRandomNumber(){
        ArrayList<String>intList= new ArrayList();
        for (int i = 0; i < 3; i++) {
            Random random= new Random();
            String fruits = Fruit.fruitReturn(random.nextInt(21));
            System.out.println(fruits);
            intList.add(fruits);
        }

        
        return 0;
    }
}
