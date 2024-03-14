package loopconcepts;

public class forloop_array {

	public static void main(String[] args) {
			//Arrays -
			int[] arr = new int[5];// 5, 10

			arr[0] = 1;

			arr[1] = 2;

			arr[2]= 4;

			arr[3]= 5;

			arr[4]= 6;

			int[] arr2 = {1,2,4,5,6,23,12,45,18,122,150,100,234};

	
			//for loop arr.length - 5

			for(int i = 0; i< arr.length; i++) //4
			{
				System.out.println(arr[i]);
			}

			for (int i =0; i<arr2.length; i++)
			{
				System.out.println(arr2[i]);
			}

			for (int i : arr2) {
				System.out.println(i);
			}
			
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
			
			String[] name = {"Kartik", "Sonawane", "selenium", "Java"};

			for(int i =0; i<name.length; i++)
			{
				System.out.println(name[i]);
			}

			for( String s: name)
			{
			System.out.println(s);
			}
		}



}
