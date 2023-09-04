package exception;

public class DuplicataAccountException extends RuntimeException{

    public DuplicataAccountException(String acountDuplicata) {
        super(acountDuplicata);
    }


}
