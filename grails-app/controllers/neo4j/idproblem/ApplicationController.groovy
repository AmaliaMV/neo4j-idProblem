package neo4j.idproblem

import neo4jSample.core.Club
import neo4jSample.core.Person

class ApplicationController {

    static responseFormats = ['json']

    def index() {

        Club club = Club.list().first()
        Person admin = club.administrator
        Long administratorId = admin.id
        Person administrator = Person.get(administratorId)
        Person admin2 = club.administrator
        Long administratorIdBrackets = admin2['id']
        Person administratorBrackets = Person.get(administratorIdBrackets)

        respond([clubId: club.id, club: club, administratorId: administratorId, administrator: administrator, administratorIdBrackets:
            administratorIdBrackets, administratorBrackets: administratorBrackets])
    }
}
