package brocampjune;

public class Ex1342StepstoReduceNumtoZero {

	public int numberOfSteps(int num) {
		int step = 0;   
		while (num>0) {
			if (num%2==0) {
			num = num/2;
			}else {
			num = num - 1;
			}
			step++;
		}
		return step;
    }
}
