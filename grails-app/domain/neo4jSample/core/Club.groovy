package neo4jSample.core

class Club extends BaseGraphDomain {

    String name

    Person administrator

    static constraints = {
        name nullable: false, blank: false, unique: true
    }
}
