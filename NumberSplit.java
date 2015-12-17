/* Author : DurgaSwaroop
 * Program : Cows & Bulls
 *
 * Description : Cows and Bulls is a number guessing game. Also, known as Mastermind in some circles. It is said that, the four digits
 * can be correctly predicted in less than 7 steps. So, the aim is to achieve that in whatever way possible.
 *
 * Last Edit Date : 17 Dec 2015
 */
public class NumbervoidSplit {
	public int[] NumberSplitter(int num){
		int[] hearray = new int[4];
		hearray[3] = num%10;
		hearray[2] = (num%100 - hearray[3]*1)/10;
		hearray[1] = (num%1000 - hearray[3]*1 - hearray[2]*10)/100;
		hearray[0] = (num - hearray[3]*1 - hearray[2]*10 - hearray[1]*100)/1000;

		return hearray;

}
