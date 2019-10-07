package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmsUsingStreams {

	public static long countGoodEggs(List<String> eggs) {
		return eggs.stream()				// 1. create stream
		.filter(egg -> egg.equals("whole")) // 2. intermediate filter operation
		.count();							// 3. terminal operation: reduce to an int
	}

	public static Object findTallest(List<Double> peeps) {
//		return Collections.max(peeps);
		return peeps.stream().sorted(Comparator.reverseOrder()).findFirst().get();
	}

	public static long addStringOfNumbers(String numbers) {
		return numbers.chars().mapToObj(c -> Character.toString(c)).mapToInt(num -> Integer.parseInt(num)).sum();

	}

	public static Object getAverage(int[] numbers) {
		return Arrays.stream(numbers).average().getAsDouble();

	}

	public static Object countOccurrences(String[] strArr, String string) {
		return (int) Arrays.stream(strArr).filter(s -> s.equals(string)).count();
	}

	public static Object addEven(String strinng) {
		return strinng
				.chars()
				.mapToObj(c -> Character.toString(c))
				.mapToInt(x -> Integer.parseInt(x))
				.filter(x -> x % 2 == 0)
				.sum();
	}

	public static Object countXs(String xString) {
		return String.chars().filter(x -> x == 'x' || x == 'X').count();
	}

	public static Object getBatPhrases(String[] batmanScript) {
		List<String> listOfBatPhrases = Arrays.asList(batmanScript);
		return listOfBatPhrases.stream().map(s -> s.replace(" ", ""))
				.filter(x -> x.equalsIgnoreCase("bam") || x.equalsIgnoreCase("pow")).map(String::toUpperCase)
				.collect(Collectors.toList());
	}

	public static Object getDistinctSpellsInAlphabeticalOrder(List<String> spellsCastThisWeek) {
		return spellsCastThisWeek.stream().distinct().sorted().collect(Collectors.toList());

	}

	public static List<String> sortWords(List<String> words) {
		return words.stream().sorted().collect(Collectors.toList());

	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		return null;
	}

	public static long countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		return 0;
	}

}
