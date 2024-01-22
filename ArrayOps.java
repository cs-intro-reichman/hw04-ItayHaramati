public class ArrayOps {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(findMissingInt(arr));
        int [] array = {1, 3, 2, 5, 10};
        System.out.println(secondMaxValue(array));
        int [] Array = {7,3,-10,-5};
        System.out.println(isSorted(Array));
        int [] Array1 = {5, 8, -15, 3, 9};
        int [] Array2 = {8, -15, 3, 9, 5};
        System.out.println(containsTheSameElements(Array1, Array2));
    }
    
    
    public static int findMissingInt (int [] arr) {
        int n = arr.length;
        int sum = (n *(n+1))/2;
        int restSum = 0;
        for (int i = 0; i < arr.length; i++) {
            restSum += arr[i];
        }
        int missingInt = sum - restSum;
        return missingInt;
        }
       
    
    

    public static int secondMaxValue(int [] array) {
        int secondMax = 0;
        int max = 0;

        if (array[0] >= array[1]) {
            max = array[0];
            secondMax = array[1];
        } else {
            max = array[1];
            secondMax = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] >= max) {
                secondMax = max;
                max = array[i];
            }
            if (array[i] < max && array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }


    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int count1 = 0; // TODO: A local variable should be declared close to the place in the code in which it is used 
                        //       Read here: https://docs.google.com/document/d/178R1ZbXLUT6myw2JjPhYRTL3mfb6oNSe/edit?usp=sharing&ouid=104564852744387575478&rtpof=true&sd=true
        int count2 = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    count1++;
                    break;
                }
            }
        }
        // TODO: it's not good to repeat your code. Use helper functions
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    count2++;
                    break;
                }
            }
        }
        if ((count1 == array1.length) && (count2 == array2.length))
            return true;
        else
            return false;
    }


    public static boolean isSorted(int [] Array) {
        int countup = 1;
        int countdown = 1;
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] >= Array[i - 1])
                countup++;
            else
                break;
        }
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] <= Array[i - 1])
                countdown++;
            else
                break;
        }
        if ((countdown == Array.length) || (countup == Array.length))
            return true;
        else
            return false;
    }
}
        
    


