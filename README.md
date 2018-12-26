# Radius

Search criteria:- returns match percentage
- Distance - radius (high weightage)
- Budget (high weightage)
- Number of bedrooms (low weightage)
- Number of bathrooms (Low weightage)


Property
    -id
    -Latitude
-Longitude
-Price
-Number of bedrooms
-Number of bathrooms

Requirement
    - Id
- Latitude
- Longitude
- Min Budget (Optional)
- Max budget(Optional if Min is present)
- Min Bedrooms required(Optional if Max is present)
- Max bedroom reqd(Optional if Min is present)
- Min bathroom reqd(Optional if Max is present)
- Max bathroom reqd.(Optional if Min is present)

Valid Match Criteria
    -Distance less than 10 miles
    -Budget +/-25%
    -Bedroom/Bathroom +/-2
    
Match contribution
    -distance<2 miles ->30%
    -min_budget<budget<max_budget -> 30%
    - if min or max is not given and budget = +/-10% -> 30%
    -min_bedroom< bedroom<max_bedroom -> 20%
    -min_bathroom< bathroom<max_bathroom -> 20%
    -if min or max is not given match percentage varies with value

Assumptions:- 
1.In case only one parameter of min/max bedroom/bathroom is present then if it satisfies minimum or maximum criteria then match weightage is considered as 20 %,.
    E.g:- If requirement is of 2 bedroom but a property is having 5 then weightage is considered as 20%, impact will be visible on weightage as cost of property is high so match % will get reduced.

2.DB queries not provided it is assumed that the application will get relevant data set.
