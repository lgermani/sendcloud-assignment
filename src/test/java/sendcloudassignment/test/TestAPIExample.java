package sendcloudassignment.test;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class TestAPIExample{

    private static String GET_URL = "";

    @Step("do a api call")
    public void doAApiCall(){
//        SerenityRest.given().pathParam("", "")
//                .log().all()
//                .baseUri(GET_URL)
//                .when().get().then().log().all();


        SerenityRest.given()
                .pathParam("", "")
                .get(GET_URL);
    }
}
