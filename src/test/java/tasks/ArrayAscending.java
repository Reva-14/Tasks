package tasks;

public class ArrayAscending {
public static void main(String[] args) {
	int[] a = new int[] {56,87,23,9,134};
	int temp = 0;
	System.out.print("BEFORE SORTING : ");
	System.out.print("{");
	for(int i = 0; i<a.length; i++ ) {
		System.out.print(a[i]);
		if(i!=a.length-1) {
			System.out.print(", ");
		}
	}
	System.out.println("}");
	for (int i = 0; i<a.length; i++) {
		for (int j = i+1; j<a.length; j++) {
			if(a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
System.out.print("AFTER SORTING : ");
System.out.print("{");
for(int i = 0; i<a.length; i++ ) {
	System.out.print(a[i]);
	if(i!=a.length-1) {
		System.out.print(", ");
	}
}
System.out.println("}");
}
}
