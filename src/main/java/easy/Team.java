package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Team {

//	Input
//	The first input line contains a single integer n (1â€‰â‰¤â€‰nâ€‰â‰¤â€‰1000) â€” the number of problems in the contest.
//	Then n lines contain three integers each, each integer is either 0 or 1.
//	If the first number in the line equals 1, then Petya is sure about the problem's solution, otherwise he isn't sure.
//	The second number shows Vasya's view on the solution, the third number shows Tonya's view.
//	The numbers on the lines are separated by spaces.
//
//	Output
//	Print a single integer â€” the number of problems the friends will implement on the contest.

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int problemNums = Integer.parseInt(br.readLine());
        int counter = 0;
        for(int i = 0; i < problemNums; i++) {
            String problem = br.readLine();
            if(problem.equals("1 1 0") || problem.equals("1 0 1") || problem.equals("0 1 1") || problem.equals("1 1 1")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

