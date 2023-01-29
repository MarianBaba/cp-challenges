package easy;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TooLongWords {

//	Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.
//
//	Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.
//
//	This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.
//
//	Thus, "localization" will be spelt as "l10n", and "internationalizationÂ» will be spelt as "i18n".
//
//	You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.
//
//	Input
//	The first line contains an integer n (1â€‰â‰¤â€‰nâ€‰â‰¤â€‰100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.
//
//	Output
//	Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.
//

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int param = Integer.parseInt(br.readLine());
        String[] inputStrings = new String[param];
        for(int i = 0; i < param; i++) {
            inputStrings[i] = br.readLine();
            if(inputStrings[i].length() > 10) {
                char first = inputStrings[i].charAt(0);
                Character last = inputStrings[i].charAt(inputStrings[i].length()-1);
                Integer len = inputStrings[i].length() - 2;
                inputStrings[i] = Character.toString(first) + len + last;

            }
            System.out.println(inputStrings[i]);
        }
    }
}

