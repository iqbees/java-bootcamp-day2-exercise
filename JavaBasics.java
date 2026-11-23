import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Shared scanner for all exercises
        Scanner scanner = new Scanner(System.in);

        // 1. Develop a program that takes the weight (in kilograms) and height (in meters)
        //as input and calculates the BMI, then prints it.

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        // 2. Write a program that takes the obtained marks and total marks as input and
        //calculates the percentage, then prints it.

        System.out.print("Enter your obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        System.out.print("Enter your total marks: ");
        double totalMarks = scanner.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("Percentage: " + percentage + "%");

        // 3. Create a program that takes an amount in one currency and an exchange rate
        //as input, then converts and prints the amount in another currency.

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Exchange rate: ");
        double exchangeRate = scanner.nextDouble();

        double convertedAmount = amount * exchangeRate;
        System.out.println("Converted amount: " + convertedAmount);

        // 4. Create a program that takes a string as input, calculates its length, and then
        //reverses the string using the StringBuilder class, finally printing both the length and
        //reversed string.

        scanner.nextLine();

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int length = str.length();

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        String reversed = sb.toString();

        System.out.println("Length: " + length);
        System.out.println("Reversed: " + reversed);

        // 5. Develop a program that takes a sentence as input and extracts a substring from
        //it, then prints the extracted substring.

        System.out.print("Enter a sentence: ");

        String sentence1 = scanner.nextLine();

        System.out.print("Start index: ");

        int startIndex = scanner.nextInt();

        System.out.print("End index: ");

        int endIndex = scanner.nextInt();

        String substring = sentence1.substring(startIndex, endIndex);

        System.out.println(substring);

        // 6. Write a program that takes a sentence and a keyword as input, then check if
        //the keyword is present in the sentence and prints the result.

        scanner.nextLine();

        System.out.print("Enter a sentence: ");

        String sentence2 = scanner.nextLine();

        System.out.print("Enter a keyword: ");

        String keyword = scanner.nextLine();

        System.out.println("Is \"" + keyword + "\" present in the sentence? " + sentence2.contains(keyword));

        // 7. Develop a program that takes a sentence and a word to replace as input, then
        //replace all occurrences of the word with another word and prints the modified
        //sentence.

        System.out.print("Enter a sentence: ");
        String sentence3 = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        System.out.println(sentence3.replace(wordToReplace, replacementWord));

        // 8. Write a program that takes two strings as input and check if they are equal,
        //ignoring the case, then prints whether they are equal or not.

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        System.out.println("str1 == str2? " + str1.equalsIgnoreCase(str2));
    }
}
