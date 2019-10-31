package com.bridgelabz.AddressBook.Services;



import java.util.List;

import com.bridgelabz.AddressBook.Model.PersonInfo;

public class Operations {
	Utility u = new Utility();
	
	public void addUsers(List<PersonInfo> listOfPerson) {
		do {
			
		PersonInfo p = new PersonInfo();
		
		System.out.println("Enter the user first name");
		p.setFname(u.inputString());
		
		System.out.println("Enter the user last name");
		p.setLname(u.inputString());
		
		System.out.println("Enter the mobile number");
		p.setMbno(u.inputString());
		
		System.out.println("Enter the adrresss ");
		p.setAddress(u.inputString());
		
		System.out.println("Enter the city");
		p.setCity(u.inputString());
		
		System.out.println("enter the state");
		p.setState(u.inputString());
		
		System.out.println("enter the zipCode");
		p.setZipCode(u.inputString());
		
		listOfPerson.add(p);
		System.out.println("user has Added");
		System.out.println("If you want to enter more User than Enter true");
		}while(u.inputBoolean());
	}
	
	public boolean deleteUser(List<PersonInfo> listOfPerson) {
		
			System.out.println("Enter the firstName");
			String fn = u.inputString();
			
			System.out.println("Enter the lastName");
			String ln = u.inputString();
			
			for(int i=0;i<listOfPerson.size();i++) {
				if(listOfPerson.get(i).getFname().equals(fn)&&listOfPerson.get(i).getLname().equals(ln)) {
					listOfPerson.remove(i);
					System.out.println("user has Deleted");
					return true;
				}
			}
			return false;	
	}
	
	public void PrintUser(List<PersonInfo> listOfPerson) {
		System.out.println("Enter the user Firstname");
		String name = u.inputString();
		for(int i=0;i<listOfPerson.size();i++) {
			if(listOfPerson.get(i).getFname().equals(name)) {
				PersonInfo temp = listOfPerson.get(i);
				System.out.println(temp.getFname()+"  "+temp.getLname()+"  "+temp.getMbno()
				+"  "+temp.getAddress()+"  "+temp.getCity()+"  "+temp.getState()+"  "+temp.getZipCode());
			}
		}
		
	}
	
	public void SortUser(List<PersonInfo> listOfPerson) {
				
		for(int i=0;i<listOfPerson.size();i++) {
			for(int j=i+1;j<listOfPerson.size();j++) {
					if(listOfPerson.get(i).getFname().compareTo(listOfPerson.get(j).getFname())>0) {
						PersonInfo temp = listOfPerson.get(i);
						PersonInfo temp2 = listOfPerson.get(j);
						listOfPerson.remove(i);
						listOfPerson.remove(j);
						listOfPerson.add(j,temp);
						listOfPerson.add(i,temp2);
					}
					}
				}
				
				
		
	}
	public void editUser(List<PersonInfo> listOfPerson) {
		System.out.println("Enter the Person name");
		String name = u.inputString();
		for(int i=0;i<listOfPerson.size();i++) {
			if(listOfPerson.get(i).getFname().equals(name)) {
				PersonInfo temp = listOfPerson.get(i);
				do {
				System.out.println("1: edit number");
				System.out.println("2: edit Address");
				System.out.println("3: edit City");
				System.out.println("4: edit ZipCode");
				System.out.println("5: edit State");
				
				int choice = u.inputint();
				
				switch(choice) {
				case 1:
					System.out.println("enter the new Number");
					temp.setMbno(u.inputString());
					break;
				case 2:
					System.out.println("Enter the new Address");
					temp.setAddress(u.inputString());
					break;
				case 3:
					System.out.println("enter the new city");
					temp.setCity(u.inputString());
					break;
				case 4:
					System.out.println("Enter the new ZipCode");
					temp.setZipCode(u.inputString());
					break;
				case 5:
					System.out.println("enter the new State");
					temp.setState(u.inputString());
					break;
				
				}
				System.out.println("If you want to edit more thing than enter true");
				}while(u.inputBoolean());
			}
		}
		
	}
	
	
	
	
	
	
	
	
}
