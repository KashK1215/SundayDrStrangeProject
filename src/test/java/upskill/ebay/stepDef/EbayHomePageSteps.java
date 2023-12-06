package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		//Loading page from setup driver class
	}
	
	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsObj.searchShoes();
	}
	
	@When("^Search for Pants$")
	public void search_for_Pants() throws Throwable {
		EbayHomePageActionsObj.searchPants();
	}
	
	@When("^Search for Shirts$")
	public void search_for_Shirts() throws Throwable {
		EbayHomePageActionsObj.searchShirts();
	}

	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomePageActionsObj.searchItems(items);
	}
	
	@Given("^Search for Big & Tall Cotton Tee$")
	public void search_for_Big_Tall_Cotton_Tee() throws Throwable {
		EbayHomePageActionsObj.searchItems("Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT.");
	}
	
	@When("^Search for Shoes$")
	public void search_for_Shoes() throws Throwable {
		EbayHomePageActionsObj.mouseHoverEbay();
	    }

	@Then("^Item list should have only Shoes related products$")
	public void item_list_should_have_only_Shoes_related_products() throws Throwable {
		EbayHomePageActionsObj.clickSummary();
	    }
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomePageActionsObj.mouseHoverEbay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomePageActionsObj.clickSummary();
	}
	
}	
	

    

    
    