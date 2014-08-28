import java.util.*;


public class Main {

	
	
	public static void main(String[] args)
	{
		LinkedList<String> stadiumName = new LinkedList<String>();
		LinkedList<Double> gameReveneu = new LinkedList<Double>();
		Iterator<String> iteratorS;
		Iterator<Double> iteratorR;
		Scanner KB = new Scanner(System.in);
		System.out.println("Enter Game Data and revenue to add to the list enter 0 to end input");
		
		while (true)
		{
			
			String stadiumTmp=KB.next();
		
			if (!stadiumTmp.equals("0"))
			{
				Double revenueTmp = Double.parseDouble(KB.next());
				stadiumName.add(stadiumTmp);
				gameReveneu.add(revenueTmp);
				
			}
			else 
			{
				break;
			}
		}
		
		
		System.out.println("End Input");
		System.out.println("\n\n Enter The Stadium For Totals");
		String targetStadium = KB.next();
		Double totals = (double)0;
		int size = stadiumName.size();				
		iteratorS = stadiumName.iterator();
		iteratorR = gameReveneu.iterator();
		do
		
		{
			System.out.println("In Loop");
			if (iteratorS.next().equals(targetStadium))
			{
				totals+=iteratorR.next();
			}
			else 
			{
				iteratorR.next();
			}
		}
		while (iteratorS.hasNext());
		System.out.println("The Totals For "+targetStadium+" are: $"+totals);
		
		
		
		
		
	}
}
