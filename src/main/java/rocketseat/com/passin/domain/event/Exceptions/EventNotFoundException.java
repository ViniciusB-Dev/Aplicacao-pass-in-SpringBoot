package rocketseat.com.passin.domain.event.Exceptions;

public class EventNotFoundException extends RuntimeException{


    public EventNotFoundException(String message){
        super(message);
    }
}
