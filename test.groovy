@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='9.4-1205-jdbc42')
import groovy.sql.Sql

def dbUrl      = "jdbc:postgresql://localhost/groovyex"
def dbUser     = "sphantom99"
def dbPassword = "1234"
def dbDriver   = "org.postgresql.Driver"

def sql = Sql.newInstance(dbUrl, dbUser, dbPassword, dbDriver)
println "The employees are: "
sql.eachRow('select * from employee'){
    row -> println"$row"
}
sql.close()