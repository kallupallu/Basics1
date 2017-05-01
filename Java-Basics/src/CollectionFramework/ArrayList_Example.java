package CollectionFramework;

import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) {
		
		ArrayList<String>  sample = new ArrayList<String>();
	    sample.add("button1");
	    sample.add("button2");
	    sample.add("button3");
	    sample.add("button4");
	    for(int i = 0; i<sample.size(); i++){
	    	System.out.println(sample.get(i));
	    }
		
	    System.out.println("*********************************************");
	    int sampleindex = sample.indexOf("button2");
	    System.out.println(sampleindex);
	    
	    sample.remove(1);
	    for (int i=0; i<sample.size(); i++){
	    	System.out.println(sample.get(i));
	    }
	    
	    System.out.println("************************************");
	    
	    sample.set(2, "button8");
	    for (int i=0; i<sample.size(); i++){
	    	System.out.println(sample.get(i));
	    }
	}
}
