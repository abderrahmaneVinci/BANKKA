package bmce



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class TypeController {

	def scaffold = true
}
