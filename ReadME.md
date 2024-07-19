### JAVA - SERIALIZATION

My personal notes while learning :
Este o modalitate de a reprezenta obiecte intr-un mod care ne permite sa le transferam .

Este un mecanism al JVM care permite transformarea unei instante intr-o serie de bytes .

Nu prea se mai foloseste fiind inlocuit de JSON , XML  pentru ca e limitat . O aplicatie nu poate sa deserializeze daca nu e tot o aplicatie JAVA .

Transient ?

Valoarea unui camp marcat ca transient nu este serializata in bytes . Este ignorata.

Ca un obiect sa fie serializabil , toate componentele sale trebuie sa fie serializabile. (eg. Owner and Dog)

OBS

Toate primitivele implementeaza interfata Serializable . + String class +++

OBS VERSIONING

Acel serializable UID practic este un cod generat de compilator in momentul in care compileaza clasa respectiva si daca acel cod UID se modifica nu se va mai putea citi va arunca o eroare . ( i se asociaza instantelor create)

Se poate controla acel serialVersionUID prin adaugarea sa statica la clasa .