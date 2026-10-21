import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Chamado {
    private String funcionario;
    private String problema;
    private String status = "Aberto";
    private LocalDateTime dataAbertura = LocalDateTime.now();

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataAberturaFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataAbertura.format(formatter);
    }
}
