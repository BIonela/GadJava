
Strategy Pattern

Folosind strategy pattern am realizat un program care simuleaza un mic joc al carui scop
este sa aduni cat mai multe puncte, atingand diferite ținte de puncte diferite:
	SmallTarget - (clicks * 5) puncte
	MediumTarget - (clicks * 5) - 20 puncte
	LargeTarget - (clicks * 5) - 40 puncte
Am creat clasa abstracta ScoreBrain pentru a abstractiza metoda comuna a celorlalte clase,
calculateScore().
In Clasa ScoreBoard am definit o variabila de instanta de tipul clasei ScoreBrain,
abstractizand astfel functionalitatea, pentru ca fiecare clasa care mosteneste clasa de baza
ScoreBrain sa poate implementa metoda calculateScore() si sa foloseasca un algoritm care 
sa calculeze scorul final in functie de situatie. 
Astfel, cu strategy pattern am putut afisa scorul pentru fiecare clasa in parte utilizand metoda
showScore(), pe care am putut-o folosi pentru a crea la runtime diferiti algoritmi fara a fi
nevoie sa schimbam ceva la nivel de clasa.

================================================================================================

Bridge Pattern

Bridge Pattern ne permite sa separam abstractizarea de implementare. In acest caz clasa 
abstracta Vehicle reprezinta partea de abstractizare iar cele doua clase: Make si Assemble, 
care implementeaza aceeasi interfata: Workshop, tin de implementare.
Clasa abstracta Vehicle si interfata Workshop sunt corelate impreuna dar intr-un mod "decuplat"
(decoupled), daca ceva trebuie schimbat in clasa Car/Bike acest lucru nu o sa afecteze modul
in care masina/bicicleta e fabricata.

================================================================================================

Prototype Pattern

Creeaza obiecte dupa un model al unui obiect existent prin clonare (Cloneable Interface).
In proiect am creat interfata Animal cu metoda clone() care mosteneste interfata
java.lang.Cloneable. 
Clasa Person implementeaza interfata Animal iar metoda clone returneaza un nou obiect de tip
Person cu aceleasi proprietati cu primul creat.
In functia main() am testat protoype pattern si folosind metoda identityHashCode am observat 
ca s-au creat doua obiecte (obiectele avand adrese diferite in memorie) cu aceleasi proprietati.

