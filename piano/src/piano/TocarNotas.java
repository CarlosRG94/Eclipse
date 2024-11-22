package piano;
import java.io.File;

import javax.sound.sampled.*;

public class TocarNotas {
	public void playDo() {
		try {
			//Cargar el archivo de audio
			File audioFile = new File("C:\\Users\\carli\\eclipse-workspace\\piano\\recursosNotas\\do.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            
            //Obtener el clip de audio y abri el flujo
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
            audioClip.start();
			
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public void playRe() {
		try {
			//Cargar el archivo de audio
			File audioFile = new File("C:\\Users\\carli\\eclipse-workspace\\piano\\recursosNotas\\re.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            
            //Obtener el clip de audio y abri el flujo
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
            audioClip.start();
			
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public void playMi() {
		try {
			//Cargar el archivo de audio
			File audioFile = new File("C:\\Users\\carli\\eclipse-workspace\\piano\\recursosNotas\\mi.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            
            //Obtener el clip de audio y abri el flujo
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
            audioClip.start();
			
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public void playFa() {
		try {
			//Cargar el archivo de audio
			File audioFile = new File("C:\\Users\\carli\\eclipse-workspace\\piano\\recursosNotas\\fa.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            
            //Obtener el clip de audio y abri el flujo
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
            audioClip.start();
			
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public void playSol() {
		try {
			//Cargar el archivo de audio
			File audioFile = new File("C:\\Users\\carli\\eclipse-workspace\\piano\\recursosNotas\\sol.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            
            //Obtener el clip de audio y abri el flujo
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
            audioClip.start();
			
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public void playLa() {
		try {
			//Cargar el archivo de audio
			File audioFile = new File("C:\\Users\\carli\\eclipse-workspace\\piano\\recursosNotas\\la.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            
            //Obtener el clip de audio y abri el flujo
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
            audioClip.start();
			
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public void playSi() {
		try {
			//Cargar el archivo de audio
			File audioFile = new File("C:\\Users\\carli\\eclipse-workspace\\piano\\recursosNotas\\si.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            
            //Obtener el clip de audio y abri el flujo
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
            audioClip.start();
			
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	

}
