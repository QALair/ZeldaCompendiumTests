package Mobs;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class MoblinTests {
    @Test
    public void testMoblinCategory(){
        given().baseUri("https://botw-compendium.herokuapp.com/api/v3/compendium/entry/moblin")
                .when()
                .get()
                .then()
                    .assertThat().statusCode(200)
                .assertThat().extract().path("data.category").toString().equals("monster");

    }

}
