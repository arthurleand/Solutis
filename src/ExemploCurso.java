import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}

public class ExemploCurso {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
//		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		cursos.stream().filter(c -> c.getAlunos() > 50).findFirst().ifPresent(c -> System.out.println(c.getNome()));

		cursos.stream().mapToInt(c -> c.getAlunos()).average().ifPresent(System.out::println);

		cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList())
				.forEach(c -> System.out.println(c.getNome()));

	}

}
