package exceptions.copy;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "This member does not exist")
public class MemberNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -2591687720244290021L;

}
