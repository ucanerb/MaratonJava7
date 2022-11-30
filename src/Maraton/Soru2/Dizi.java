package Maraton.Soru2;

import java.util.Arrays;

public class Dizi {

public static void main(String[] args) {
		
		int[] arr = {5,6,29,6,17,29,45,13,-6,-34};
		
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						
							System.out.println(arr[i]);
							
						}
					}

				}
		}
}