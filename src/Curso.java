import java.util.ArrayList;
import java.util.List;

public class Curso {
    public String nome;
    public String descricao;
    public List<String> professores = new ArrayList<>();
    public byte cargaHoraria;

    public void verProgresso() {
        System.out.println("Estamos na metade do curso.");
    }
    public void verNotas() {
        System.out.println("Notas: 9.0, 8.0, 7.0, 9.5, 10.0");
    }
    public void verParticipacao() {
        System.out.println("Participação dos alunos é online e síncrona.");
    }
}
