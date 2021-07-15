package assignment2;

public class SimpleQTest {
	public static void main(String [] args){
		ClientQueue cq1 = new ClientQueue();
		eTest(cq1,10,5); // enqueue something
		display(cq1,1); // print some q stats
		eTest(cq1,20,4); // add another thing
		display(cq1,1);
		dTest(cq1); // dequeue something
		display(cq1,1);
		dTest(cq1);
		display(cq1,1);
		dTest(cq1); // test dequeue on empty
		display(cq1,1);
		ClientQueue cq2 = new ClientQueue();
		System.out.print("Non\t");
		display(cq2,2); // test a second queue
		eTest(cq2,50,25);
		display(cq2,2);
		eTest(cq2,60,35);
		display(cq2,2);
		eTest(cq2,70,45);
		display(cq2,2);
		eTest(cq2,80,55);
		display(cq2,2);
		eTest(cq2,90,65);
		display(cq2,2);
		eTest(cq1,30,3); // make sure queues aren't linked
		display(cq1,1);
		System.out.print("Non\t");
		display(cq2,2); // check FIFO
		dTest(cq2);
		display(cq2,2);
		dTest(cq2);
		display(cq2,2);
		dTest(cq2);
		display(cq2,2);
		dTest(cq2);
		display(cq2,2);
		dTest(cq2);
		display(cq2,2);
		dTest(cq2);
		display(cq2,2);
	    }

	    private static void eTest(ClientQueue cq, int a, int u){
		System.out.print("Add\t");
		cq.enqueue(a,u);
	    }
	    
	    private static void dTest(ClientQueue cq){
		System.out.print("Del\t");
		cq.dequeue();
	    }
	    
	    private static void display(ClientQueue cq,int num){
		System.out.print("Q"+num+"  ");
		if(cq.isEmpty())
		    System.out.print("Empty   \t");
		else
		    System.out.print("NotEmpty\t");
		System.out.println("Length: "+cq.length()+"\t aTimeHead: "+cq.peekArrive()+"\t uTimeHead: "+cq.peekUsage());
	    }
}
