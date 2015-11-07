import java.util.*;


public class SetUp {
	public HashMap myContacts;
	public ArrayList myDestinations;
	public void SetUp (){
		myContacts = new HashMap<String, Integer>();
		myDestinations = new ArrayList<String>();
	}
	public void addContact(String name, Integer phoneNumber){
		if (myContacts.containsKey(name)){
			System.out.println("A contact by that name already exists");}
		else{myContacts.put(name, phoneNumber);}
	}
}
