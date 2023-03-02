package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook_examples {

	@Before
    public void starting_the_program(){
        System.out.println("This will run before the Scenario");
    }	
	
	@After
    public void program_ends(){
        System.out.println("This will run after the Scenario");
    }
	
}
