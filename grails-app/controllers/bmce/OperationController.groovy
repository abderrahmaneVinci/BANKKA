package bmce



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class OperationController {

    def scaffold = true
}
