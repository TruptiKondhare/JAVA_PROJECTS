package wiproProxy;
interface SortingStrategy{
	void sort(int[] data);
}
class  BubbleSortStrategy implements SortingStrategy{
	@Override
	public void sort(int[] data) {
		System.out.println("Sorting using bubble sort...");
	}
}
class MergeSortStrategy implements SortingStrategy{
	@Override
	public void sort(int[]data) {
		System.out.println("Sorting using merging..");
	}
	
}
class DataSorter{
	private SortingStrategy strategy;
	public DataSorter(SortingStrategy strategy) {
		this.strategy=strategy;
	}
	public void sortData(int[]data) {
			strategy.sort(data);
				
		
	}
	public void setStrategy (SortingStrategy strategy) {
		this.strategy=strategy;
	}
}
public class StrategyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data= {5,2,8,1,3};
		
		SortingStrategy bubbleSortStrategy=new BubbleSortStrategy();
		DataSorter sorter =new DataSorter (bubbleSortStrategy);
		sorter.sortData(data);
		System.out.println("Strategy changed at runtime ");
		sorter.setStrategy(new MergeSortStrategy());
		sorter.sortData(data);

	}

}
