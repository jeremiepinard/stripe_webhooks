package controllers;

import com.stripe.Stripe;
import com.stripe.model.Event;
import com.stripe.net.APIResource;
import play.mvc.Controller;
import play.mvc.Result;

public class WebhooksController extends Controller {

    static {
        Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";
    }

    // stripe webhook handler
    public static Result handle() {
        // Retrieve the request's body and parse it as JSON
        Event eventJson = APIResource.GSON.fromJson(request().body().toString(), Event.class);

        //For the  eventJson.getType() == "charge.succeeded"
        //Charge charge = (Charge)eventJson.getData().getObject();


        // todo:  ignore all event types other than charge.succeeded, customer.created, customer.subscription.created

        // todo: store the information to support report requirements


        //return badRequest();
        return ok();
    }
    
}
