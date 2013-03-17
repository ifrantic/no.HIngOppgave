hei!!

i pakken no.apto.java ligger det en fil som heter Main.java.
Kjør den for å se hvordan ting kan fungere

i pakken no.apto.java.db ligger klasser for tilkobling til database
i pakken no.apto.java.db.beans ligger klasser for å holde data fra databasen. Disse er ment å bruke videre feks mot grafisk grensesnitt
i pakken no.apto.java.db.derbydb er det litt testgreier, skal ikke brukes
i pakken no.apto.java.db.derbydb.table er det egen klasse mot hver tabell. Disse klassene gjør spørringer mot gitte tabeller
i databasen, lagrer data i tilsvarende klasse i no.apto.java.db.beans for videre bruk i applikasjonen.

Hver klasse i no.apto.java.db.derbydb.table har/skal ha metoder for følgende:

-skriv inn ny oppføring i tabellen
-hent oppføring fra tabellen
-oppdater oppføring i tabellen
-slett oppføring i tabellen
-fri spørring mot tabellen


