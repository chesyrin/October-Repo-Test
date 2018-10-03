/**
 * Oct 1 2018
 * Just some coding challenges
 */
public class Tests {

  
  public static void main(String[] args) { 
    int[] array = {1,2,3,4,5,6,7};
    
    //testing duplicates 
    System.out.println(duplicates(array));
    
    //testing rotate_Array
    int[] eArray = rotateArray(array, 3);
    for (int i = 0; i<array.length; i++){
      System.out.print(eArray[i] + " ");
    }
    System.out.println();
    
    //testing sorting algorithms
    int arr[] = {10, 7, 8, 9, 1, 5}; 
    int n = arr.length; 
    
    Sorting ob = new Sorting(); 
    ob.sort(arr, 0, n-1); 
    
    System.out.println("sorted array"); 
    Sorting.printArray(arr); 
    
  }
  
    /* duplicates (int[] origArray)
   * if there are duplicates in an array, then return true
   * 
   * Test case:
   * Input: [1,2,3,1]
   * Output: true
   */
  private static boolean duplicates(int[] origArray){
    Arrays.sort(origArray);
    boolean fin = false;
 
    
    for (int i = 0; i< origArray.length - 1; i++){
      if (origArray[i] == origArray[i+1]){
        fin = true;
      }
    }
    return fin;
  }//end of method
  
  /* rotateArray(int[] origArray, int k)
   * Given an array, rotate the array to the right by k steps, 
   * where k is non-negative. 
   * 
   * Test case:
   * Input: [1,2,3,4,5,6,7] and k = 3
   * Output: [5,6,7,1,2,3,4]
   */
  
  private static int[] rotateArray(int[] origArray, int k)
  {
    int[] editedArray = new int[origArray.length];
    
    int j = 0;
    for (int i = k + 1; i< origArray.length; i++){
      editedArray[j] = origArray[i];
      j++;
    }
    for (int i = 0; i < k+1; i++){
      editedArray[j] = origArray[i];
      j++;
    }
    
    return editedArray;
  }//end of method
  
}//end of class
