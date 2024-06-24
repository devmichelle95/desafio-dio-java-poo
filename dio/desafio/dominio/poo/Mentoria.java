package dio.desafio.dominio.poo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(){

    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    private LocalDate data;

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
