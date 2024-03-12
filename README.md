# Kočka a myš

## Pravidla
* Kočka i myš se mohou pohybovat jen vodorovně a svisle.
* Myš se snaží sníst jitrnici a sýr.
* Kočka se snaží chytit myš.
* Kočka ani myš nemohou projít skrze strom.
* Myš se ovládá pomocí šipek, kočka pomocí kláves A, S, D, W.

## Cíl
Pokud myš sní jitrnici i sýr, vyhrála myš. Pokud dřív kočka chytí myš, vyhrála kočka.

## Cvičení
Ve třídě `Uloziste` implementujte `ulozitStavDoSouboru` a `nacistStavZeSouboru` tak, aby bylo možné uložit aktuální stav hry do souboru a zase jej načíst.
Kočka i myš mají metody getLocation() a setLocation(), které vrací jejich aktuální souřadnice, resp. umožní souřadnice nastavit.

Pro zápis dat do souboru použijte `objectMapper.writeValue(file, object)`, pro načtení ze souboru použijte `objectMapper.readValue(file, UlozenyStav.class)`.