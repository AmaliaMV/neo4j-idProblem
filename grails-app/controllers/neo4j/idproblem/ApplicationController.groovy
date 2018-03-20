package neo4j.idproblem

import neo4jSample.core.Club
import neo4jSample.core.Person

class ApplicationController {

    static responseFormats = ['json']

    def index() {

        Club club = Club.list().first()
        Long administratorId = club.administrator.id
        Person administrator = Person.get(administratorId)
        Long administratorIdBrackets = club.administrator['id']
        Person administratorBrackets = Person.get(administratorIdBrackets)

        respond([clubId: club.id, club: club, administratorId: administratorId, administrator: administrator, administratorIdBrackets:
            administratorIdBrackets, administratorBrackets: administratorBrackets])
    }
}
