public class Q3_ArrayInsertionDemo{

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		int[] newArray;
		newArray = new int[beforeArray.length +1];
		for (int i=0;i<indexToInsert;i++) {
			newArray[i] = beforeArray[i];
		}
		newArray[indexToInsert] = valueToInsert;
		for (int i=indexToInsert; i<newArray.length-1; i++){
			newArray[i+1] = beforeArray[i];
		}
		return newArray;
	}

	public static void main(String[] args){
		int[] arrayBefore=new int[] {1,5,4,7,9,6};
		System.out.println("Array before insertion: ");
		for (int i=0;i<arrayBefore.length;i++){
			System.out.println(arrayBefore[i]);
		}
		int index=3;
		int integer=15;
		int[] array;
		array=Q3_ArrayInsertionDemo.insertIntoArray(arrayBefore,index,integer);
		System.out.println("Array after insertion of "+integer+" at position "+index+":");
		for (int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}
