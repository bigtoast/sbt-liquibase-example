import atd.sbtliquibase.LiquibasePlugin

organization := "atd"

name := "sbt-liquibase-example"

version := "0.1"

libraryDependencies += "org.liquibase" % "liquibase-core" % "2.0.2"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.10"

seq(LiquibasePlugin.liquibaseSettings: _*)

liquibaseUsername := ""

liquibasePassword := ""
                        
liquibaseDriver   := "com.mysql.jdbc.Driver"
                        
liquibaseUrl      := "jdbc:mysql://localhost:3306/test_db?createDatabaseIfNotExist=true"

publishTo := Some(Resolver.file("bigtoast.github.com", file(Path.userHome + "/Projects/Destroyer/bigtoast.github.com/repo")))

