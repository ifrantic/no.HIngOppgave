hei!!

i pakken no.apto.java ligger det en fil som heter Main.java.
Kj�r den for � se hvordan ting kan fungere

i pakken no.apto.java.db ligger klasser for tilkobling til database
i pakken no.apto.java.db.beans ligger klasser for � holde data fra databasen. Disse er ment � bruke videre feks mot grafisk grensesnitt
i pakken no.apto.java.db.derbydb er det litt testgreier, skal ikke brukes
i pakken no.apto.java.db.derbydb.table er det egen klasse mot hver tabell. Disse klassene gj�r sp�rringer mot gitte tabeller
i databasen, lagrer data i tilsvarende klasse i no.apto.java.db.beans for videre bruk i applikasjonen.

Hver klasse i no.apto.java.db.derbydb.table har/skal ha metoder for f�lgende:

-skriv inn ny oppf�ring i tabellen
-hent oppf�ring fra tabellen
-oppdater oppf�ring i tabellen
-slett oppf�ring i tabellen
-fri sp�rring mot tabellen


