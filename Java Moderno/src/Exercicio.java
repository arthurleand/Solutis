import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Exercicio {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);

		// 1�
//		numbers.forEach(System.out::println);

		// 2�
//		numbers.stream().distinct().sorted().forEach(System.out::println);

		// 3�
//		numbers.stream().filter(n -> n%2 == 1).distinct().sorted().forEach(System.out::println);

		// 4�
//		int soma = numbers.stream().skip(3).mapToInt(n-> n).sum();
//		System.out.println(soma);

		// 5�
//		numbers.stream().map(n -> n*2).forEach(System.out::println);

		// 6�
//		List<Integer> collectImpar = numbers.stream().filter(n -> n%2 == 1).distinct().collect(Collectors.toList());
//		System.out.println(collectImpar);
//		List<Integer> collectPar = numbers.stream().filter(n -> n%2 == 0).distinct().collect(Collectors.toList());
//		System.out.println(collectPar);

		// 7�
//		  Integer max = numbers.stream().max(Comparator.naturalOrder()).orElseThrow();
//		  System.out.println(max);

		// 8�
//		numbers.stream().limit(3).forEach(System.out::println);

		// 9�
//		numbers.stream().mapToInt(n -> n).average().ifPresentOrElse(System.out::println, () -> System.out.println("Double.NaN"));

		// 10�
//		long count = numbers.stream().mapToInt(n -> n).count();
//		System.out.println(count);
//		int sum = numbers.stream().mapToInt(n -> n).sum();
//		System.out.println(sum);
//		OptionalDouble average = numbers.stream().mapToInt(n -> n).average();
//		System.out.println(average);
//		Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());
//		System.out.println(max);
		
		// 11�
		LocalDate hoje = LocalDate.now();   
        numbers.stream().distinct().sorted().forEach(n ->System.out.println(hoje.plusDays(n)));

	}
}
