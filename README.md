# Context of the exercise

We are a reporting company. One of our partners is integrated with Stripe, which is a payment system. We need to show the following reports:

- How many customers where created during a specified period
- Top 10 revenue generating cities based on the credit-cards issuing country for the specified period
- The number of subscriptions per plan id for the specified period

For generating this report, we have hooked an endpoint to receive webhooks from Stripe.
- WebhooksController.handle

You need to implement in memory storage mechanism to catch the appropriate events and complete the method ReportController.getReportData to return the data required above. Keep in mind the in memory storage may need to be replaced with a database solution in the next project phase.      
 

Later questions:
- Does it impact us if Stripe sends us the same event multiple times?