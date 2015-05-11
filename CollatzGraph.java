class CollatzGraph {
	// Start with loopCount from Session 1. Every time it generates
	// a new member of the sequence, add a node for the integer to the
	// graph (unless a node for that integer is already present).
	// If such a node is already present, loopCount should not have to
	// generate the rest of the sequence. However, it still must return
	// the length of the sequence starting from x.
	// NOTE: loopCount is no longer static. You will need to use one
	// or more instance variables to store information (the current
	// graph, for example) between calls.
	int loopCount(int x) {
		// STUDENTS: FILL IN CODE HERE!
		
		//loopCount(16)
		
		// 16 8 4 2 1
		
		
		return 0;
	}

	// This method sets the initial state of the graph and any other
	// instance variables of the class.
	// HINT: This is a good place to create an initial node for the integer 1.
	// If you do this, then your termination check will be a lot simpler!
	void initialize() {
		// STUDENTS: FILL IN CODE HERE!
		
		//do I just make a node that has the number 1.
	}

	// Using loopCount, fill in the function maxLoop so that it returns
	// the maximum sequence length for any sequence that starts with a
	// number greater than or equal to x and less than y.
	int maxLoop(int x, int y) {
		// STUDENTS: FILL IN CODE HERE!
		
		return 0;
	}

	public static void main(String[] args) {
		CollatzGraph graph = new CollatzGraph();
		graph.initialize();
		System.out.println(graph.maxLoop(1, 1000));
		// STUDENTS: maxloop and loopcount have constructed a graph that
		// contains the collatz sequence for every integer from 2 to 1000
		// as well as for every integer contained in those sequences. Think
		// of a question about the graph and write a query that answers it.
		// Some interesting (IMO) questions that come to mind are:
		// (1) how many nodes are in the graph? How fast is it growing?
		// (2) what is the largest integer in the graph?
		// (3) what is the smallest integer that is not in the graph?
	}
}
