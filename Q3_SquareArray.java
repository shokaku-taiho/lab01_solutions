public class Q3_SquareArray{
	public static int[] createArray(int size) {
		int[] array = new int[size+1];
		for (int i=0; i<=size; i++){
			array[i] = i*1;
		}
		return array;
	}

	public static void main(String[] args){
		int[] newArray;
		newArray = Q3_SquareArray.createArray(12);
		for (int i=0; i<newArray.length; i++){
			System.out.println("The square of " + i + " is: " + newArray[i]);
		}
	}
}
