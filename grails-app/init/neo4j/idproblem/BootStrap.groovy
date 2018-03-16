package neo4j.idproblem

import neo4jSample.core.Club
import neo4jSample.core.Person

class BootStrap {

    def init = { servletContext ->

        Club.withNewSession {
            Club.withNewTransaction {
                Club club = Club.findByName('Boca Jrs')

                if (!club) {
                    club = new Club(name: 'Boca Jrs')
                    club.administrator = new Person(name: 'Canelo').save()
                    club.save()
                }
            }
        }

    }
    def destroy = {
    }
}
