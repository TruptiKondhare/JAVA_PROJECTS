package wipro5;
class ShoppingItem {
private String name;
private double quantity;

public ShoppingItem(String name, double quantity) {
   this.name = name;
   this.quantity = quantity;
}
public String getName() {
   return name;
}
public double getQuantity() {
  return quantity;
}

@Override
public String toString() {
   return String.format("%s: %.2f kg", name, quantity);
}
}
//Builder interface for constructing shopping items

interface ShoppingItemBuilder {
void addGrocery(String name, double quantity);
void addVegetable(String name, double quantity);
void addFruit(String name, double quantity);
}

//Concrete builder implementing the ShoppingItemBuilder interface
class ShoppingBuilder implements ShoppingItemBuilder {
private ShoppingItem groceries;
private ShoppingItem vegetables;
private ShoppingItem fruits;

public ShoppingBuilder() {

   groceries = new ShoppingItem("Groceries", 0);
   vegetables = new ShoppingItem("Vegetables", 0);
   fruits = new ShoppingItem("Fruits", 0);
}
@Override

public void addGrocery(String name, double quantity) {
   groceries = new ShoppingItem(name, quantity);
   
   
}
@Override
public void addVegetable(String name, double quantity) {
   vegetables = new ShoppingItem(name, quantity);
}
@Override
public void addFruit(String name, double quantity) {
   fruits = new ShoppingItem(name, quantity);
}
public ShoppingItem getGroceries() {
   return groceries;
}
public ShoppingItem getVegetables() {
   return vegetables;
}
public ShoppingItem getFruits() {
   return fruits;
}
}
//Director class to direct the construction process

class ShoppingDirector {
public void construct(ShoppingItemBuilder builder) {
   builder.addGrocery("Rice", 2);
   builder.addVegetable("Tomato", 1.5);
   builder.addVegetable("Spinach", 0.5);
   builder.addFruit("Apple", 3);
   builder.addFruit("Banana", 2);}}

public class asi3 {
public static void main(String[] args) {
   ShoppingBuilder builder = new ShoppingBuilder();
   ShoppingDirector director = new ShoppingDirector();
   director.construct(builder);
   // Get the constructed shopping items
   ShoppingItem groceries = builder.getGroceries();
   ShoppingItem vegetables = builder.getVegetables();
   ShoppingItem fruits = builder.getFruits();
   // Print the shopping list
   System.out.println("Shopping List:");
   System.out.println("Groceries: " + groceries);
   System.out.println("Vegetables: " + vegetables);
   System.out.println("Fruits: " + fruits);
   System.out.println("Total Cost: "  );
}
}


