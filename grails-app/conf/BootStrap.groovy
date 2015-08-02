import grails.converters.JSON
import org.demo.person.Person
import org.demo.person.EmailAddress

class BootStrap {

    def init = { servletContext ->
		JSON.registerObjectMarshaller(EmailAddress) {
			def returnArray = [:]
			returnArray['email'] = it.address
			return returnArray
			}
		
		(new Person(username:"marsli", firstName:"Mars", lastName:"Li", email:"marsli@gmail.com")).save(flush:true, failOnError:true)
    }
    def destroy = {
    }
}
