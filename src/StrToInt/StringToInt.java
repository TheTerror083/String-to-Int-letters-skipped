package StrToInt;

public class StringToInt {
    public int myAtoi(String s) {
        int result = 0;
        int i = 0;
        int converted = 0;
        char currChar;
        boolean isNegative = false;
        
        while(i < s.length())	//O(n)
        {
            currChar = s.charAt(i);
            if(currChar == '-')
            {
                isNegative = true;
            }
            if(Character.isDigit(currChar) == false)
            {
                if(currChar != ' ')
                    if(currChar != '+' && currChar != '-')
                        break;
            }
            if(Character.isDigit(currChar) == true)
            {
                converted = currChar - '0'; // the char '0' is the ascii offset for conversion
                
                //ensure there is no overflow/ underflow:
                //the result is calculated as positive until the end,
                //which only then it's sign will be decided.
                //This means there is no need to check for Integer.MIN_VALUE as it will always return false.
                if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && converted > Integer.MAX_VALUE % 10))
                {
                    if(isNegative == false)
                        return Integer.MAX_VALUE;

                    return Integer.MIN_VALUE;
                }

                //otherwise add the converted digit to the result:
                result = result*10 + converted;

            }
            i++;
        }
        if(isNegative == true)
        {
            result = result * (-1);
        }
        return result;
    }

}
