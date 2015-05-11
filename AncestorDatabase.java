import java.util.HashMap;

class AncestorDatabase {
	HashMap<String, AncestorTree> family = new HashMap<String, AncestorTree>();

	class AncestorTree{
		String name;
		String mom;
		String dad;
		
		AncestorTree(String a, String b, String c){
			name = a;
			mom = b;
			dad = c;
		}
	}
	
	void addPerson(String one, String two, String three){
		//addPerson("John", "Mary", "Tony")
		//addPerson("Bob", "Mary", "Tony")
	
		//AncestorTree a = new AncestorTree(one, two, three);
		
		if(!family.containsKey(one)){
			family.put(one, new AncestorTree(one, two, three));
		}
	}
	
	boolean isAncestor(String a, String b){
		//I will finish this later and send it to you via Github

		if(!family.containsKey(a) || !family.containsKey(b)) return false;

		while(family.get(b).name != null){
			if(b.equals(a)) return true;
			b = family.get(b).dad;
		}

		while(family.get(b).name != null){
			if(b.equals(a)) return true;
			b = family.get(b).mom;
		}

		return false;

	}
	
	boolean isDescendent(String a, String b){
		//I will finish this later and send it to you via Github
		if(!family.containsKey(a) || !family.containsKey(b)) return false;
		
		while(family.get(a).name != null){
			if(a.equals(b)) return true;
			a = family.get(a).dad;
		}

		while(family.get(a).name != null){
			if(a.equals(b)) return true;
			a = family.get(a).mom;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}