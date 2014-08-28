import java.util.*; 
public class runTreeMap {
	public static void main(String args[]) {
		// Create a tree map
		TreeMap<String, Double> tm = new TreeMap<String,Double>();
		// Put elements to the map
		tm.put("John Doe", new Double(3434.34));
		tm.put("Tom Smith", new Double(123.22));
		tm.put("Jane Baker", new Double(1378.00));
		tm.put("Todd Hall", new Double(99.22));
		tm.put("Ralph Smith", new Double(-19.08));
		// Get a set of the entries
		Set<Map.Entry<String,Double>> set = tm.entrySet();
		// Get an iterator
		Iterator<Map.Entry<String,Double>> i = set.iterator();
		// Display elements
		while(i.hasNext()) {
		Map.Entry<String,Double> me = (Map.Entry<String,Double>)i.next();
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
		}
		System.out.println();
		// Deposit 1000 into John Doe's account
		double balance = ((Double)tm.get("John Doe")).doubleValue();
		tm.put("John Doe", new Double(balance + 1000));
		System.out.println("John Doe's new balance: " +
		tm.get("John Doe"));
		} 
}
