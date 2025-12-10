import java.time.LocalDate;

public abstract class Item {
    private String titulo;
    private int ano;
    private Genero genero;

    public Item(int ano, String titulo, Genero genero) {
        setAno(ano);
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        int anoActual = LocalDate.now().getYear();
        if (ano <= anoActual) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("El año (" + ano + ") es posterior al año actual (" + anoActual + ") y es inválido.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public abstract String info();
    
}
