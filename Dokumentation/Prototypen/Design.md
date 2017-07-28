# Prototypen - Design
## Uns sind die F�higkeiten Abspielen von Musik/Soundeffekten, Grafische Darstellung und das beobachten von Keyboardeingaben nicht bekannt - von daher wird je ein Prototyp f�r diesen Bereich erstellt.
## Um den Code weiterverwenden zu k�nnen und um zu garantieren, dass die Tests ausreichend sind ist es Notwendig die Tests vorher festgelegt werden.

# Prototyp - Input
## Erstellen einer Klase inputHandler welche ein Singleton ist
## Erstellen der Methode getKeyState( keyName ) welche bestimmt ob die Taste keyName grade gedr�ckt gehalten wird
## Erstellen der Methode notifyKeyState( keyName, callBack ) welche eine Methode der Klasse callBack aufruft, sobald eine Taste gedr�ckt wird
# Zum testen reicht es aus zwei Tasten zu �berwachen, je eine mit einer der Methoden.

# Prototyp - Graphics
## Erstellen einer Klasse graphicsHandler welche ein Singleton ist
## Erstellen einer Klasse graphicsHandlerPicture
## Erstellen der Methode graphicsHandler.addPicture welche einen Pfad zu einer Bilddatei annimmt und ein Objekt vom Typ graphicsHandlerPicture zur�ckgibt
## Erstellen der Methode graphicsHandlerPicture.setPosition( x, y ) um die Position eines Bildes zu ver�ndern
## Erstellen der Methode graphicsHandler.draw welche die ganzen Bilder mit ihrer jetzigen Position zeichnet und an das Fenster ausgibt
# Zum testen reicht es aus zwei Bilder getrennt voneinander zu Bewegen

# Prototyp - Music
## Erstellen einer Klasse musicHandler welche ein Singleton ist
## Erstellen einer Klasse musicHandlerSound
## Erstellen der Methode musicHandler.addMusic welche einen Pfad zu einer Musikdatei annimmt und ein Objekt vom Typ musicHandlerSound zur�ckgibt
## Erstellen der Methode musicHandlerSound.play welche den Sound abspielt
## Erstellen der Methode musicHandlerSound.playLoop welche den Sound in Dauerschleife abspielt
## Erstellen der Methode musicHandlerSound.stop welche das abspielen stoppt
# Zum testen reicht es aus zwei Sounds zu laden und einen in Dauerschleife abzuspielen und den anderen zuf�llig einzustreuen