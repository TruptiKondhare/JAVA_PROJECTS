
package wipro5;
import java.util.ArrayList;
import java.util.List;
//Step 1: 
//2 interfaces item and packing.methods in this interface name,packing,price
interface Item {
	public String name();
	public Packing packing();
	public float price();}	
//in this interface pack method is there
interface Packing {
	 public String pack();}
//Step 2:
class Wrapper implements Packing {
	 		 @Override
	 		public String pack()
	 		{
	 			 return "Wrapper";}}
class Bottle implements Packing {
	 @Override
	 public String pack() {
		 return "Bottle"; } }
//Step 3:
//Burger and Cold Drink are Abstract where it will be having VegBurger and NonVeg ..burger as the subclass....this is a abstract class that implements item interface ..overide the packing method and price method inside the class..


abstract class Burger implements Item {
	@Override
	 public Packing packing() {
		return new Wrapper();
	}
	@Override
	public abstract float price();
	}

// this is a abstract class that implements item interface ..overide the packing method and price method inside the class..

abstract class ColdDrink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract float price();
}

//Step 4:
//this class extends Burger parent class....and overrides the price and name method

class VegBurger extends Burger {
	@Override
	public float price() {
		return 150.0f ;
	}
	@Override
	public String name() {
		return "Veg Burger";
	}
	}

// this class extends Burger parent class....and overrides the price and name method
class ChickenBurger extends Burger {
	@Override
	public float price() {
		return 250.0f;
	}
	@Override 
	public String name() {
		return "Chicken Burger";
	}
}
	
// this class extends ColdDrink parent class....and overrides the price and name method 
class Coke extends ColdDrink {
	 @Override
	 public float price() {
		 return 30.0f;
	 }
	  
	 @Override
	 public String name() {
		 return "Coke";
	 }
}
	
// this class extends ColdDrink parent class....and overrides the price and name method 
class Pepsi extends ColdDrink {
	 @Override
	 public float price() {
		 return 35.0f;
	 }
	 
	 @Override
	 public String name() {
		 return "Pepsi";
	 }
}
	 
//Step 5:
class Meal{
	private List<Item> items=new ArrayList<Item>();
	public void addItem(Item item) {
		items.add(item);
	}
	public float getCost() {
		float cost=0.0f;
		for (Item item:items) {
			cost+=item.price();	
		}
		return cost;	
	}
	public void showItems() {
		for (Item item:items) {
			System.out.println("Item:: "+ item.name());
			System.out.println("Packing:: "+ item.packing().pack());
			System.out.println("\n Price:: "+ item.price());	
		}
	}
}

//Step 6

class MealBuilder{
	public Meal prepareVegMeal() {
		Meal meal=new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;		
	}
	public Meal prepareNonVegMeal() {
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
//Step 7

public class Builder {
	public static void main(String asrgs[]) {
		MealBuilder mealBuilder =new MealBuilder();
		Meal vegMeal =mealBuilder.prepareVegMeal();
		System.out.println("Veg meal"); 
		vegMeal.showItems();
		System.out.println("Total cost ::"+vegMeal.getCost());
		
		Meal nonvegMeal =mealBuilder.prepareNonVegMeal(); 
		
		System.out.println("\n NonVeg meal");
		nonvegMeal.showItems();
		System.out.println("Total cost ::"+nonvegMeal.getCost()); 
	
	}	
}





