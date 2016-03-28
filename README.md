# Context of the exercise

We are a reporting company. One of our partners is integrated with Stripe, which is a payment system. 
You are supposed to provide a json API for a webapp that will need to show the following information in a report:

- How many customers where created during a specified period
- The number of subscriptions per plan id for the specified period
- Top 10 revenue generating customers for the specified period

What to do:

- implement an in-memory storage mechanism to keep the appropriate events in the WebhooksController file
- complete the method ReportController.getReportData to return the data required above. 

Notes: Keep in mind the in memory storage may need to be replaced with a database solution in the next project phase.      

Follow-up questions:

- Does it impact us if Stripe sends us the same event multiple times? If so, how to work around this issue?
- What if we want to change the way we calculate any of the report's metrics. How does that impact the code?
- What if we want to use multiple servers running this. How does it impact the code?