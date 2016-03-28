package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class ReportController extends Controller {

    /*
    returns a json payload containing reporting information based on a date range
     */
    public static Result getReportData( /* todo startDate, endDate */ ) {

        // todo information to be contained in the report

        // todo 1- how many customers where created during this period -- look at the events_sample/customer_created.json event

        // todo 2- The number of subscriptions per plan id for the specified period -- look at the events_sample/customer_subscription_created.json event

        // todo 3- Top 10 revenue generating customers for the specified period -- look at the events_sample/charge_succeeded.json event

        return ok();
    }
    
}
