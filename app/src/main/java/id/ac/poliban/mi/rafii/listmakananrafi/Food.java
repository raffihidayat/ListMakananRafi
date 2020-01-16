package id.ac.poliban.mi.rafii.listmakananrafi;

public class Food {
    private String foods;
    private String foodName;
    private String foodDesc;

    public Food(String foods, String foodName, String foodDesc) {
        this.foods = foods;
        this.foodName = foodName;
        this.foodDesc = foodDesc;
    }

    public String getFoods() {
        return foods;
    }

    public void setFoods(String foods) {
        this.foods = foods;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

 @Override
    public String toString(){
        return String.format("%30\n\n%s", getFoodName(), getFoodDesc());
 }
}
