/* this program receives a number as a command line argument and converts it
 to an integer.
 when a non-digit letter is encountered, the conversion stops 
 and the result will be the numbers before the letter.
 however, leading spaces will not cause a problem and are ignored.
 when a space between numbers is encountered the conversion will stop.*/

package StrToInt;

public class Exec {

	public static void main(String[] args) {
		StringToInt obj = new StringToInt();
		System.out.println(obj.myAtoi(args[0]));
	}

}
