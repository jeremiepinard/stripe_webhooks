package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class ReportController extends Controller {

    /*
    returns a json payload containing reporting information based on a date range
     */
    public static Result getReportData( /* todo startDate, endDate */ ) {

        // todo information to be contained in the report
        // 1- how many customers where created during this period -- look at the customer.created event
        // 2- Top 10 revenue generating customers for the specified period -- look at the charge.succeeded event
        // 3- The number of subscriptions per plan id for the specified period -- look at the customer.subscription.created event

        return ok();
    }
    
}
