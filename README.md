### Running REST Average calculation Program Instructions

* unzip rest-csv.zip
* cd rest-csv (Go inside rest-csv)
* run command ->  ./mvnw spring-boot:run
* on another terminal curl -X POST -F 'data=@data.csv' -F 'column=number' http://localhost:8080


### Program Assumptions

1. This program accepts upto 100MB CSV file size, file size is configurable and can be changed in application.properties file.
2. POST api returns average of the given column without any rounding on the precision. (Future scope - can take scale as an optional input param from the user and rounding can be done based on the given scale)
4. This program runs on port 8080, need to make sure 8080 is not already in use.