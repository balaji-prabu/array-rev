public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'G','#','S','E','T','@'};
		int f = arr.length;
		 
		for(int y = 0, z = f-1; y < z; y++, z--) 
        {
			char temp = arr[y];
			if((((int)arr[z]>=65)&&((int)arr[z]<=90)) || ((int)arr[z]>=97)&&(arr[z]<=122))
			{
				if((((int)arr[y]>=65)&&((int)arr[y]<=90)) || ((int)arr[y]>=97)&&(arr[y]<=122))
				{
					arr[y] = arr[z];
					arr[z] = temp;
				}
				else
				{
					arr[y] = arr[y];
					z++;
				}
			}
			else
			{
				arr[z] = arr[z];
				y--;
			}
        }
		System.out.println(arr);
	}

}
