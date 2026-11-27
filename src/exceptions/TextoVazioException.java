package exceptions;

public class TextoVazioException extends RuntimeException {
    
    public TextoVazioException (String mensagem) {
        super (mensagem);
    }
}