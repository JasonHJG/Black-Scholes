###############################
###### Run Instruction  #######
###############################
Run HomeworkTwo to see the results. User can change the inputs to option object in order
to see the results for different options.

###############################
##########  Result  ###########
###############################

Solution Converges
The Price for European Option with:
Initial stock price 152.35
Strike price 165.0
Expiration time 252
Volatility 0.01
Interest rate 1.0E-4
is: 6.182652467877651


Solution Converges
The Price for Aasian Option with:
Initial stock price 152.35
Strike price 164.0
Expiration time 252
Volatility 0.01
Interest rate 1.0E-4
is: 2.2442640583124294

###############################
######  Implementation  #######
###############################

###RandomVectorGenerator###
There is one class Gaussian implementing this interface. By calling getVector() in Gaussian,
a gaussian vector with length input by the user will be generated.

There is one decorator Transform implementing this interface. Transform is an abstract class
and is extended to class Antithetic where the method getVector() is modified to give a negative
gaussian vector.

###StockPath###
There is one class GBMStockPath implementing this interface. By calling getPrices() in GBMStockPath,
a LinkedList of PriceNode object will be generated.

PriceNode object contains the information of time and price, it gives the price of the stock
at specific time t.

Option object contains all the information about the option, including its name, type(European
or Asian), start date, end date, interest rate, volatility, strike price.

###PayOut###
There are two classes implementing this interface. EuropeanPayOut and AsianPayOut implements
two different payout methods. EuropeanPayOut gives the maximum between 0 and (S-K) at end of 
the period, while AsianPayOut gives the maximum between 0 and ave(S-K) for the entire period.

###StatsCollector###
This class records the results of PayOut and calculate a statistically significant result
for our simulation
