import java.util.Scanner;

public class Iphone implements Phone, Ipod, Browser {
    String music;
    boolean isMusicSelected = false,
            isMusicPlaying = false;

    Scanner scanner = new Scanner(System.in);
    public Iphone(){

    }

    @Override
    public void attend() {
        System.out.println("Attending a call");
        
    }

    @Override
    public void call() {
        System.out.println("Calling...");
        
    }

    @Override
    public void voiceMail() {
        System.out.println("Starting voice mail");
        
    }

    @Override
    public void pause() {
        if(isMusicPlaying){
            isMusicPlaying = false;
            System.out.println("Music paused");
        }else{
            System.out.println("There's no music playing");
        }
        
        
    }

    @Override
    public void play() {
        music = scanner.nextLine();
        selectMusic(music);
        isMusicPlaying = true;
        System.out.printf("Playing music %s\n", music);
        
    }

    @Override
    public void selectMusic(String music) {
        isMusicSelected = true;
        System.out.println("Music selected");   
    }

    @Override
    public void newTab() {
        System.out.println("New tab browser");
        
    }

    @Override
    public void reloadPage() {
        System.out.println("Reload page");
        
    }

    @Override
    public void viewPage() {
        System.out.println("Viewing page");
        
    }
    
}
