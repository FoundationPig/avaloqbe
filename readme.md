See Model, Fizzbuzz, and Dockerfile logic below.


#BE Model

    public BuzzFizzModel(List<Integer> fizz, List<Integer> buzz, List<Integer> fizzbuzz) {
        this.fizz = fizz;
        this.buzz = buzz;
        this.fizzbuzz = fizzbuzz;
    }

    public List<Integer> getFizz() {
        return fizz;
    }

    public void setFizz(List<Integer> fizz) {
        this.fizz = fizz;
    }

    public List<Integer> getBuzz() {
        return buzz;
    }

    public void setBuzz(List<Integer> buzz) {
        this.buzz = buzz;
    }

    public List<Integer> getFizzbuzz() {
        return fizzbuzz;
    }

    public void setFizzbuzz(List<Integer> fizzbuzz) {
        this.fizzbuzz = fizzbuzz;
    }

#BE Rest Endpoint with fizzbuzz logic


    @RestController
    @CrossOrigin(origins = "*")
    @RequestMapping("/buzzfizz")

    @RestController
    @CrossOrigin(origins = "*")
    @RequestMapping("/buzzfizz")    
    
    
    @GetMapping
    public BuzzFizzModel getData(@RequestParam("data") Integer limit) {
        return createResponse(limit);
    }
    private BuzzFizzModel createResponse(Integer limit) {
        List<Integer> fizz = new ArrayList();
        List<Integer> buzz = new ArrayList();
        List<Integer> fizzbuzz = new ArrayList();
        for(int input = 1; input <= limit; input++) {
            if(input % 3 == 0 && input % 5 == 0) {
                fizzbuzz.add(input);
            } else if (input % 5 == 0) {
                buzz.add(input);
            } else if(input % 3 == 0) {
                fizz.add(input);
            }
        }
        return new BuzzFizzModel(fizz, buzz, fizzbuzz);
    }



#DockerFile for running spring boot application on java 8


    FROM openjdk:8
    ARG JAR_FILE=target/*.jar
    COPY ${JAR_FILE} app.jar
    ENTRYPOINT ["java","-jar","/app.jar"]

1st line pulls base java 8 image from dockerhub  
2nd line sets name as argument to the generated jar by maven  
3rd line copies jar file to the docker image  
4th line runs jar file in the container