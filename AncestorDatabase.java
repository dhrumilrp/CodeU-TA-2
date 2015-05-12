import java.util.HashMap;

class AncestorDatabase {
	static HashMap<String, AncestorTree> family = new HashMap<String, AncestorTree>();
	static class AncestorTree{
		String name;
		String mom;
		String dad;
		
		AncestorTree(String a, String b, String c){
			name = a;
			mom = b;
			dad = c;
		}
	}
	
	static void addPerson(String one, String two, String three){
		//addPerson("John", "Mary", "Tony")
		//addPerson("Bob", "Mary", "Tony")
		//AncestorTree a = new AncestorTree(one, two, three);
		
		if(!family.containsKey(one)){
			family.put(one, new AncestorTree(one, two, three));
		}
	}
	
	static boolean isAncestor(String a, String b){
		//I will finish this later and send it to you via Github
		if(!family.containsKey(b) || a.equals(b)) return false;
		
		String temp = b;
		while(family.containsKey(b)){
			if(b.equals(a) || family.get(b).mom.equals(a) ||
					family.get(b).dad.equals(a)) return true;
			b = family.get(b).dad;
		}
		
		while(family.containsKey(temp)){
			if(temp.equals(a) || family.get(temp).mom.equals(a) ||
					family.get(temp).dad.equals(a)) return true;
			temp = family.get(temp).mom;
		}
	
		return false;
	}
	
	static boolean isDescendent(String a, String b){
		//I will finish this later and send it to you via Github
		if(!family.containsKey(a) || a.equals(b)) return false;
		String temp = a;
		while(family.containsKey(a)){
			if(a.equals(b) || family.get(a).mom.equals(b) ||
					family.get(a).dad.equals(b)) return true;
			a = family.get(a).dad;
		}
		
		while(family.containsKey(temp)){
			if(temp.equals(b) || family.get(temp).mom.equals(b) ||
					family.get(temp).dad.equals(b)) return true;
			temp = family.get(temp).mom;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addPerson("John", "Mary", "Tony");
		addPerson("Tony", "Molly", "Bob");
		addPerson("Mary", "Sammy", "Ray");

		System.out.println(isDescendent("John", "Ray"));
		System.out.println(isDescendent("John", "Fake"));
		System.out.println(isDescendent("John", "Molly"));
		System.out.println(isDescendent("John", "Bob"));
		
		System.out.println(isAncestor("Sammy", "Mary"));
		System.out.println(isAncestor("Ray", "John"));
		System.out.println(isAncestor("John", "Molly"));
		System.out.println(isAncestor("Bob", "John"));
	}
}