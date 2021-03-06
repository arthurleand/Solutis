import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do c?digo");
		palavras.add("caelum");

//		 Consumer<String> imprime = new Imprime(); palavras.forEach(imprime);

		palavras.forEach(s -> System.out.println(s));

//		Comparator<String> compare = new Compare(); palavras.sort(compare);

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
//		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);
		
		
	}
}

/*
 * class Compare implements Comparator<String> {
 * 
 * @Override public int compare(String s1, String s2) { if (s1.length() >
 * s2.length()) return 1; if (s2.length() > s1.length()) return -1; return 0; }
 * 
 * }
 */

/*
 * class Imprime implements Consumer<String> {
 * 
 * @Override public void accept(String s) { System.out.println(s);
 * 
 * }
 * 
 * }
 */
