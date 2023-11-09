package Morsey;
import java.util.*;
import java.io.*;
public class Convertor {
String tempEnglish;
String tempPhonetic;
String tempMorse;
String i ="";
Character tempCharacter;
Hashtable<String, Character> letTable = new Hashtable<String, Character>();
Hashtable<String, Character> MTable = new Hashtable<String, Character>();
FileReader fw;
BufferedReader Proccesor;
Convertor(){
Processfile();
}
private void Processfile() {
try {
//FileReader dr = new FileReader("Data");
File DataFile = new File("dataFile");
System.out.println("1aa");
fw = new FileReader(DataFile);
System.out.println("2aa");
Proccesor = new BufferedReader(fw);
System.out.println("3aa");
System.out.println("line");
System.out.println("4aa");
while(i != null) {
	i = Proccesor.readLine();
	tempEnglish = i;
	i =Proccesor.readLine();
	tempMorse = i;
	i = Proccesor.readLine();
	tempPhonetic = i;
	tempCharacter = new Character(tempEnglish, tempPhonetic, tempMorse);
	letTable.put(tempEnglish, tempCharacter);
	MTable.put(tempMorse, tempCharacter);
	System.out.println(tempCharacter.toString());
}
}
catch(Exception e){System.out.println("ERROR Processfile");}
}
//returns the morse value for the corresponding key
public String getMorse(String key) {
	key = key.toUpperCase();
	if(letTable.containsKey(key)) {
		return letTable.get(key).getMorse();
	}
	return "Mistake with (" + key + ")";
}
public String getEnglish(String key) {
	key = key.toUpperCase();
	if(MTable.containsKey(key)) {
		return MTable.get(key).getEnglish();
	}
	return "ERROR getEnglish";
}
//should always be on 1 line no special characters
public String getMorsePhrase(String key, Boolean ShowgapPhrase) {
	String phrase = "";
	for(int x = 0; x < key.length(); x++) {
		phrase += getMorse("" + key.charAt(x));
		if(ShowgapPhrase) { phrase += Character.gap;}	
	}
	return phrase;
}
public String getEnglishPhrase(String key) {
	String phrase = "";
	String mPhrase = "";
	for(int x = 0; x < key.length(); x++) {
		if((key.charAt(x) == '|')) {
		phrase += getEnglish(mPhrase);
		mPhrase = "";
		}else{
		mPhrase += key.charAt(x);
		}
	}
	
	return phrase;
}
}
