package hw3part1;
/**
 * Assignment 	#3
 * Question 	#1
 * 
 * @author 	Nancy Rahal and  Michelle Sawan
 * ID 		201800674 , 201801993
 * 
 * Course	GIN231 Sect. #21705
*/

//part1
public class RecursionHelper {

    public static int cannonball(int height) {
    	    if(height == 1) 
    	        return 1;
    	    
    	    return (height * height) + cannonball(height - 1);
    }

    public static boolean checkPalindrome(String s) {
    	if(s.length()<=1)
		{
			return true;
		}
		else if(s.charAt(0)!=s.charAt(s.length()-1))
		{
			return false;	
		}
		return checkPalindrome(s.substring(1, s.length()-1));
    }

    public static boolean subsetSum(int start, int[] nums, int target) {
    	    if (start >= nums.length)
    	      return (target == 0);

    	   if(subsetSum(start + 1, nums, target - nums[start]) || subsetSum(start + 1, nums, target)) 
    	     return true;  

    	     return false;
    }

    public static int pascal(int row, int column) {
    	  if (column == 0)
    	        return 1;
    	    else if (row == 0)
    	        return 0;
    	  
    	        return pascal(row-1, column) + pascal(row-1, column-1);
    }
    
    //part2
    public static void main(String[] args) {
   	 System.out.println(cannonball(16));
   	 System.out.println("'Laval' is a Palindrome: " + checkPalindrome("Laval"));
   	 int[] arr = { 7, 4, 3, 9 };
   	 subsetSum(0, arr, arr.length - 1);
   	 System.out.println(pascal(9,5));
        
   }
}