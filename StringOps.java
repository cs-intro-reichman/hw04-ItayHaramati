public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("Leo Messi is the best footballer ever"));
        int[] arr = allIndexOf( "Hello world" ,'l');
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
        public static String capVowelsLowRest(String String) {
            String vowels = "aeiou"; 
            String VOWELS = "AEIOU";
            String s1 = "";
            for(int i = 0; i < String.length(); i++){
              if(vowels.indexOf(String.charAt(i)) != -1)
                 s1 += (char) (String.charAt(i) - 32); 
                  else if(VOWELS.indexOf(String.charAt(i)) != -1) {
                      s1+= String.charAt(i);
                    }  else {
                      if(vowels.indexOf(String.charAt(i)) == -1 && VOWELS.indexOf(String.charAt(i)) == -1) {
                        }  if(String.charAt(i) >= 'A' && String.charAt(i) <= 'Z') {
                           s1 += (char) (String.charAt(i) + 32);
                             }  else  {
                               s1+= String.charAt(i);  
                         }
                        }
                      } 
              return s1;
          }
      


    public static String camelCase (String string) {
        String newword = "";

        //// Changing the first letter to small letter
            char first = string.charAt(0);
            int num = (int) first;
            if (num >= 65 && num <= 90) {
                num = num + 32;
                char e = (char) num;
                newword = newword + e;
            } else {
                newword = newword + first;}
        
        //// Changing the first letter of each word after the first word to capital letter,
        /// erasing all spaces, and converting other letters to small letters
            boolean cap = false;
        
            for (int i = 1; i < string.length(); i++) {
                char currentchar = string.charAt(i);
                int num1 = (int) currentchar;
                if (num1 == 32) {
                    cap = true;
                } else {
                    if (cap) {
                        if (num1 >= 97 && num1 <= 122) {
                            num1 = num1 - 32;
                        }
                        char con = (char) num1;
                        newword = newword + con;
                        cap = false;
                    } else {
        /// other letter to small letters
                        if (num1 >= 65 && num1 <= 90) {
                            num1 = num1 + 32;}
                        newword = newword + (char) num1;
                    }
                }
            }
            return newword;
        }
        

    public static int[] allIndexOf (String str, char chr) {
        int arraycount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr)
                arraycount++;
        }

        int[] arr = new int[arraycount];
        arraycount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                arr[arraycount] = i;
                arraycount++;
            }
        }
        return arr;

    }

    }

