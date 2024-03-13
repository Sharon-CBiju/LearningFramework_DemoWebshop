


import org.testng.Reporter;
import org.testng.annotations.Test;


import com.basePackage.BaseClass;
import com.elementRepository.WelcomePage;

public class VoteInCommunityPool extends BaseClass{
	//vote and submit in community poll

	@Test
	public void voteInCommunityPool() {

		//1.Login		
		//Happens in the BaseClass

		//click on good poll
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getPollGood().click();
		softAssert.assertEquals(welcome.getPollGood().isSelected(), true,"Good is not selected");
		Reporter.log("Poll is selected",true);
		
		//click on vote button
		welcome.getVoteButton().click();
		softAssert.assertEquals(welcome.getTotalVoteText().getText().contains("vote(s)"), true,"Vote button is not clicked");
		Reporter.log("Vote button is clicked", true);

	}

}
