import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Collection
{
     public static void main(String args[])
     {
        // Declaring a type of collection - list - ArrayList with String datatype
    	System.out.println("*** Collection with duplicates ***");
        List<String> names = new ArrayList<String>();
		//Adding values to ArrayList
		names.add("Subbarao");
		names.add("Harisha");
		names.add("Vedansh");
		names.add("Rishika");
		names.add("Jahnavi");
		names.add("Vedansh");
		names.add("Anusha");
		names.add("Jyothi");
		names.add("Rishika");
		names.add("Jahnavi");   
		List<Integer> num=new ArrayList<Integer>();
		num.add(2);
		num.add(4);
		num.add(2);
		num.add(6);
		num.add(3);
		num.add(8);
		num.add(5);
		num.add(5);
        // Printing the ArrayList
        System.out.println("List of the Names : " +names);
        System.out.println("List of the Numbers : " +num);
        //objective is to remove the duplicates from the collection.
        // let us use LinkedHashSet for this. As this set will not allow to insert the duplicates
		// and also the order of the list provided will be same.
        System.out.println("*** Collection without duplicates ***");    
        Set<String> namesWithoutDup = new LinkedHashSet<String>(names); //copied the arraylist into LinkedHashSet       
        names.clear();// clear the arraylist       
        names.addAll(namesWithoutDup); //copying the values without duplicates into ArrayList   
        Set<Integer> numWithoutDuplicates=new LinkedHashSet<Integer>(num);
        num.clear();
        num.addAll(numWithoutDuplicates);
		System.out.println("list of Names without duplicates :");
		for(int i=0;i<names.size();i++)
        System.out.println(names.get(i)+"");   
		System.out.println("list of Numberes without duplicates :");
		for(int i=0;i<num.size();i++)
        System.out.println(num.get(i)+"");
    }
}

