import java.io.*;

/*Program writes Array data to a text file*/

class SaveResults{
    public static void main(String[] args) {
    	String[] results = {"Vuyo", "Katu", "Bernie"}; // Intitializes Array
    	writeToFile(results); // Calls method
}

    public static void writeToFile(String[] resArray){ // Method contains code to write to file. Takes String Array as argument
    	PrintWriter writer = null;
    	try{
    		writer = new PrintWriter("results.txt"); // PrintWriter object can write data to file named "result.txt"
    		for(int i =0; i< resArray.length; i++){
    		writer.println(resArray[i]); // iterates through array and prints item to file
    		}
    	}catch (Exception e){ // catch all Exceptions
    		System.out.println(e.getMessage()); //print exception object's message to console
    	}
    	writer.close(); // closes the PrintWriter to deallocate the memory

    }
}
