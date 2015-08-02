package org.demo.person

import static org.junit.Assert.*
import org.junit.*
class EmailServiceTests {
	
	def emailService
	
	def person

    @Before
    void setUp() {
        //person = new Person(username:"mars_li", firstName:"Mars", lastName:"Li", email:"mars_li@gmail.com")
		//person.save(flush:true, failOnError:true)
    }

    @After
    void tearDown() {
        //person.delete(flush: true)
    }

    @Test
    void testGetEmail() {
        assert emailService != null, "EmailService is null!"
		assert emailService.getEmail("mars_li")?.address == "mars_li@gmail.com"
    }
}
