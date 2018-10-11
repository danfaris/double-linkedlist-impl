package com.nci.example;

public class DLApp {

	public static void main(String[] args) {

		DLList dl = new DLList();
		dl.add(1, "Bill");
		dl.add(2, "Alice");
		dl.add(3, "Elena");
		dl.add(4, "Paul");
		dl.add(3, "Danny");
		dl.add(1, "AnnMarie");

		System.out.println("Size of the list: " + String.valueOf(dl.size()));
		System.out.println("List Elements:");
		dl.printList();

		dl.remove(3); // Remove element "Elena"

		System.out.println("List Elements after removing element on position 3:");
		dl.printList();

		dl.remove(1); // Remove element "AnnMarie"
		System.out.println("List Elements after removing element on position 1:");
		dl.printList();

		System.out.println("Size of the list: " + String.valueOf(dl.size()));
		dl.remove(dl.size()); // Remove element "AnnMarie"
		System.out.println("List Elements after removing element on the last position:");
		dl.printList();

		System.out.println("Backward Printing of the Elements: ");
		dl.printBackwardList();

	}

}
