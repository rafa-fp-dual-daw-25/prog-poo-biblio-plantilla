public class Libro extends Item {
    private String isbn;
    private int paginas;
    private Autor autor;

    public Libro(String titulo, int ano, Genero genero, String isbn, int paginas) {
        super(ano, titulo, genero);
        this.isbn = isbn;
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String info() {
        return "Título: " + getTitulo() + " Páginas: " + getPaginas() + " Autor: " + this.autor.getNombre();
    }
}
