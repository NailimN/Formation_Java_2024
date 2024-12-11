
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal){
        boolean onList = false;
        for (String mealIndex: this.meals) {
            if (meal.equals(mealIndex)){
                onList = true;
            }
        }
        if(!onList){
        this.meals.add(meal);
        }
    }
    
    public void printMeals(){
        for (String meal: this.meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }

    // implement the required methods here
}
