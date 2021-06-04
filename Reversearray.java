public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayRev("C.P");
	}
	
	private static void arrayRev(String input) {

		char[] arr = input.toCharArray();
		int i = 0, j = arr.length-1;

		// following is the logic
		while(i<j){
		    if(!Character.isLetterOrDigit(arr[i])){
			i++;
			continue;
		    }
		    else if(!Character.isLetterOrDigit(arr[j]))  {
			j--;
			continue;
		    }
		    char temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		    i++;
		    j--;
		}

		System.out.println(arr);
    }

}
