/**
 * Oct 1 2018
 * Just some coding challenges
 */
public class Tests {
  
//  public Tests() { 
//  }
  
  public static void main(String[] args) { 
    int[] array = {1,2,3,4,5,6,7};
    int[] eArray = rotateArray(array, 3);
    for (int i = 0; i<array.length; i++){
      System.out.println(eArray[i]);
    }
    
  }
  
  /* rotateArray(int[] origArray, int k)
   * Given an array, rotate the array to the right by k steps, 
   * where k is non-negative. 
   * 
   * Test case:
   * Input: [1,2,3,4,5,6,7] and k = 3
   * Output: [5,6,7,1,2,3,4]
   */
  
  public static int[] rotateArray(int[] origArray, int k)
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
