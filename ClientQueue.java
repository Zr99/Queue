public class ClientQueue {
	
		//Declare the variables
		private Client first;
		private Client last;
	
	//Create a method that takes t and u as the parameter
	public void enqueue(int t, int u) {
		Client c = new Client(t,u);
		//If the last item is null
		if(last == null) {
			//first is equal to last
			first = last = c;
		}
		else {
			// Set the next last item to the current
			last.next = c;
			//Set the last item equal to current item
			last = c;
		}	
	}
	
	//Create the method that removes the head of the queue
	public void dequeue() {
		//Create a try catch method
		try {
			//Create a current pointer 
			//Connect it to the first item
			Client curr = first;
			
			//If current is null return nothing
			if(curr == null) {
				return;
			}
			else {
				//Connect the pointer to the next item in order to remove the queue
				first= curr.next;
				//Set the pointer to null
				curr.next = null;
			}
			
			//If first is empty Last is empty also
			if(first == null) {
				last = null;
			}
		}catch(Exception e) {
			//Print out the error message
			System.out.println(e);
		}	
	}
	
	//Return the values of ARRIVE Time of the head of the queue
	public int peekArrive() {
		//Declare the variable
		int EMPTY = -1;
		//if the first queue is empty show EMPTY
		if(first == null) {
			return EMPTY;
		}
		else {
			//return the time arrive
			return first.arrTime;
		}
		
	}
	//Return the values of USE Time of the head of the queue
	public int peekUsage() {
		//Declare the variable
		int EMPTY = -1;
		//if the first queue is empty show EMPTY
		if(first == null) {
			return EMPTY;
		}
		else {
			//Return the time use
			return first.useTime;
		}	
	}
	
	//True if the first item is empty
	public boolean isEmpty() {
		return (first == null);
	}
	
	// count the Client number in the queue
	public int length() {
		//Declare the count
		 int count = 0;
		 Client curr = first;
		 //check if the list is not NULL then increment 1 at count
		 while(curr != null) {
			 count++;
			 curr = curr.next;
		 }
		 return count;
	}

	//Create a object as Client
	class Client{
		
		//Declare the variables
		private int arrTime = 0;
		private int useTime = 0;
		private Client next;
		
		//Create the constructor
		public Client(int arr, int use) {
			next =null;
			arrTime = arr;
			useTime = use;
		}
			
		//Get the variables
		public Client getClient() {
			return next;
		}
		public int getArrTime() {
			return arrTime;
		}
		public int getUseTime() {
			return useTime;
		}
	}
}
