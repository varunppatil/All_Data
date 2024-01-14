package my.package.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class AppTest {

    @When("^User login with username and password$")
    public void user_login_with_username_and_password() throws Throwable {
        throw new PendingException();
    }

    @Then("^He will go to home page$")
    public void he_will_go_to_home_page() throws Throwable {
        throw new PendingException();
    }

    @And("^Cards are displayed $")
    public void cards_are_displayed() throws Throwable {
        throw new PendingException();
    }

}