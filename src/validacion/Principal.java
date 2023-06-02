package validacion;
public class Principal {
    public static void main(String[] args) {
        PDF pdf1 = new PDF("PDF1", true);
        PDF pdf2 = new PDF("PDF2", true);
        Word word1 = new Word("libros", 23);
        Word word2 = new Word("libro", 78);
        ServicioValidar sv = new ServicioValidar();
        Video video1 = new Video();

        sv.agregarArchivo(pdf1);
        sv.agregarArchivo(pdf2);
        sv.agregarArchivo(word1);
        sv.agregarArchivo(word2);
        sv.agregarArchivo(video1);

        sv.validar();

    }
}
